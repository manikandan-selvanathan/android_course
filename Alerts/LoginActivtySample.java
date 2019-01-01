package com.saimobileapps.www.sampleappdec26;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivtySample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activty_sample);
        SharedPreferences sharedPreferences=getSharedPreferences("SampleShare",MODE_PRIVATE);
        String un=sharedPreferences.getString("username",null);
        String pw=sharedPreferences.getString("password",null);

        if(un!=null)
        {
            Intent intent=new Intent(this,SharedPreferenceActivity.class);
            startActivity(intent);
        }
        else
        {
            //Do Nothing
        }
    }

    public void checkUser(View view)
    {
        try{
            EditText username=findViewById(R.id.edit_text_one);
            EditText password=findViewById(R.id.edit_text_two);

            String userName_text=username.getText().toString();
            String password_text=password.getText().toString();

            SharedPreferences sharedPreferences=getSharedPreferences("SampleShare",MODE_PRIVATE);//create /get xml file
            SharedPreferences.Editor editor=sharedPreferences.edit();//editor mode.
            editor.putString("username",userName_text);//add values
            editor.putString("password",password_text);
            editor.commit();//save

            Intent intent=new Intent(this,SharedPreferenceActivity.class);
            startActivity(intent);

//            if(userName_text.length()==0)
//            {
//                //Toast.makeText(LoginActivtySample.this,"Invalild Username",Toast.LENGTH_LONG).show();
//                //username.setError("Invalild Username");
//                //Snackbar.make(findViewById(R.id.root_ll),"Invalid Username",Snackbar.LENGTH_SHORT).show();
//
//
//                AlertDialog.Builder builder=new AlertDialog.Builder(LoginActivtySample.this);
//                builder.setTitle("Error");
//                builder.setMessage("Username invalid");
//                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                    //Body
//                    }
//                });
//                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                builder.setNeutralButton("MayBe", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//
//                AlertDialog alertDialog=builder.create();
//                alertDialog.show();
//
//            }
//            if(password_text.length()==0)
//            {
//                //Toast.makeText(LoginActivtySample.this,"Invalild Password",Toast.LENGTH_LONG).show();
//                //password.setError("Invalild Password");
//                //Snackbar.make(findViewById(R.id.root_ll),"Invalid Password",Snackbar.LENGTH_SHORT).show();
//            }


        }
        catch (Exception e)
        {


        }
    }
}
