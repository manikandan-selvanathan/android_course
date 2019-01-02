package com.saimobileapps.www.sampleappdec26;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

public class FragmentActivitySample extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_sample);

    }

    void AttachFragments()
    {
        try
        {
            fragmentTransaction.replace(R.id.first_box,new BlankFragment1());
            fragmentTransaction.replace(R.id.second_box,new BlankFragment2());
            fragmentTransaction.commit();

        }
        catch (Exception e)
        {

        }
    }

    public void onRadioButtonClicked(final View view) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try{
                    fragmentManager=getSupportFragmentManager();
                    fragmentTransaction=fragmentManager.beginTransaction();
                    if(view.getId()==R.id.first_rb)
                    {
                        fragmentTransaction.replace(R.id.first_box,new BlankFragment1());
                    }
                    else
                    {
                        fragmentTransaction.replace(R.id.first_box,new BlankFragment2());
                    }
                    fragmentTransaction.commit();
                }
                catch (Exception e)
                {
                    Log.e("ExceptionMessageCustom",e.getMessage());
                }
            }
        });

    }
}
