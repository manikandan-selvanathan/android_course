package com.saimobileapps.learning;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SharedPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        SharedPreferences sharedPreferences=getSharedPreferences("sharedpreferencefilesample", Context.MODE_PRIVATE);//Xml
        String useraname=sharedPreferences.getString("username_value",null);

        if(useraname==null)
        {
            //Remains Same
        }
        else
        {
            Intent intent=new Intent(this,SharedPreferenceActivtyTwo.class);
            startActivity(intent);
        }
    }

    public void saveLoginCredentials(View view)
    {
        try{
            EditText username_et=findViewById(R.id.userName);
            EditText password_et=findViewById(R.id.password);
            String username=username_et.getText().toString();
            String password=password_et.getText().toString();

            SharedPreferences sharedPreferences=getSharedPreferences("sharedpreferencefilesample", Context.MODE_PRIVATE);//Xml File Creation
            SharedPreferences.Editor sharedEditor=sharedPreferences.edit(); //Open in a Editor Mode
            sharedEditor.putString("username_value",username); //Add Values
            sharedEditor.putString("password_value",password);//Add Values
            sharedEditor.commit();//Save it
            Intent intent=new Intent(this,SharedPreferenceActivtyTwo.class);
            startActivity(intent);
        }
        catch (Exception e)
        {

        }
    }
}
