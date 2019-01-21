package com.facebook.www.ContentProvidersSample;

import android.Manifest;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.facebook.www.R;

public class ContentProviderSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider_sample);


        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.READ_CONTACTS)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_CONTACTS},33);
        }
        else
        {
            ReadContacts();
        }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==33)
        {
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                ReadContacts();
            }
        }
    }

    void ReadContacts()
    {
        try{
            ContentResolver contentResolver=getContentResolver();
            Cursor cursor=contentResolver.query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null);
            if(cursor!=null&&cursor.getCount()>0)
            {
                String value="";
                Log.d("ContentProviderSample","There are some contacts");
                while (cursor.moveToNext())
                {
                    String id = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
                    Cursor phones = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,ContactsContract.CommonDataKinds.Phone.CONTACT_ID +" = "+ id,null, null);
                    while (phones.moveToNext()) {
                        String phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                        Log.i("Number", phoneNumber);
                        value=value+cursor.getString(0)+"\t"+phoneNumber+"\n\n";
                    }
                    phones.close();

                }

                TextView textView=findViewById(R.id.contacts_list);
                textView.setText(value);
            }
            else {
                Log.d("ContentProviderSample","No contacts available");
            }
        }
        catch (Exception e)
        {

        }
    }
}
