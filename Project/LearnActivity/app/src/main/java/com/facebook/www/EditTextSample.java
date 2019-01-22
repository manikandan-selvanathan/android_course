package com.facebook.www;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditTextSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_sample);
        Button button=findViewById(R.id.button);
        final EditText editText=findViewById(R.id.edit_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("edit_text",editText.getText().toString());
                if(editText.getText().toString().length()==0)
                {
                    editText.setError("Please enter phone number");
                }
                else if(CheckPhoneNumber(editText.getText().toString()))
                {
                    Log.d("edit_text","Valid PhoneNumber");
                    editText.setError(null);
                    Snackbar.make(findViewById(R.id.rootLl),"Valid PhoneNumber",Snackbar.LENGTH_LONG).show();
                    Toast.makeText(EditTextSample.this,"Valid PhoneNumber",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    editText.setError("InValid Phone Number");
                    Log.d("edit_text","InValid PhoneNumber");
                    Snackbar.make(findViewById(R.id.rootLl),"InValid PhoneNumber",Snackbar.LENGTH_LONG).show();
                    Toast.makeText(EditTextSample.this,"InValid PhoneNumber",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    boolean CheckPhoneNumber(String number)
    {
        if(number.length()==10)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
}

