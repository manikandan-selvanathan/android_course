package com.saimobileapps.learning.Validation;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.saimobileapps.learning.R;

public class LoginActivitySample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sample);
    }

    public void validate(View view) {
        try{

            EditText username_et=findViewById(R.id.userName);
            EditText password_et=findViewById(R.id.password);
            String username=username_et.getText().toString();
            String password=password_et.getText().toString();
            if(username.length()==0) //UserName Empty Validation
            {
                //username_et.setError("Username Should not be empty");
                ShowErrorMessage("Username should not be empty");
            }
            if(password_et.length()==0) //UserName Empty Validation
            {
                //password_et.setError("Username Should not be empty");
                ShowErrorMessage("Password should not be empty");
            }

            //Only Number Validation
            boolean isOnlyNumber;
            try{
                int valu=Integer.parseInt(password);//Trying to convert string to int
                isOnlyNumber=true;
            }
            catch (Exception e)
            {
                isOnlyNumber=false;
            }


            if(!isOnlyNumber)
            {
                //password_et.setError("Password Should contain only numbers");
                return;
            }

        }
        catch (Exception e)
        {

        }
    }

    void ShowErrorMessage(String Message)
    {
        try{
            //Toast.makeText(LoginActivitySample.this,Message,Toast.LENGTH_SHORT).show();
            //Snackbar.make(findViewById(R.id.rootLl),Message,Snackbar.LENGTH_SHORT).show();

            AlertDialog.Builder obj=new AlertDialog.Builder(LoginActivitySample.this);
            obj.setTitle("Error");
            obj.setMessage(Message);
            obj.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog alertDialogObj=obj.create();
            alertDialogObj.show();
        }
        catch (Exception e){

        }
    }
}

