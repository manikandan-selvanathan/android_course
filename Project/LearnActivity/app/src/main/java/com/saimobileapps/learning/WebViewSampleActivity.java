//package com.facebook.www;
//
//import android.content.DialogInterface;
//import android.support.v7.app.AlertDialog;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.KeyEvent;
//import android.view.View;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.RadioButton;
//import android.widget.Spinner;
//
//import java.util.ArrayList;
//
//public class WebViewSampleActivity extends AppCompatActivity {
//    WebView webview;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//          setContentView(R.layout.activity_web_view_sample);
//        webview=findViewById(R.id.webview);
//        webview.loadUrl("http://mmttechmaaxx.com/app/index.php");
//        webview.getSettings().setJavaScriptEnabled(true);
//        webview.setWebViewClient(new CustomWebViewClientHelper(this));
//        Button alertTitle_button=findViewById(R.id.alertTitle_button);
//        alertTitle_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try
//                {
//                    AlertDialog.Builder al=new AlertDialog.Builder(WebViewSampleActivity.this);
//                    al.setTitle("Error!!");
//                    al.setMessage("Username or password");
//                    al.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//
//                        }
//                    });
//                    al.setCancelable(false);
//                    AlertDialog alertDialog=al.create();
//                    alertDialog.show();
//                }
//                catch (Exception e)
//                {
//
//                }
//            }
//        });
//
//
//        Spinner spinner_view=findViewById(R.id.spinner_view);
//        final ArrayList<String> listOfCities=new ArrayList<>();
//        listOfCities.add("Chennai");
//        listOfCities.add("Madhurai");
//        listOfCities.add("Covai");
//        listOfCities.add("Thiruchi");
//        listOfCities.add("Namakal");
//        spinner_view.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String selectedCity=listOfCities.get(position);
//                Log.d("spinner_view_selected_item",selectedCity);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//        ArrayAdapter<String> spinner_array_adapter=new ArrayAdapter<String>(WebViewSampleActivity.this,R.layout.spinner_custom_layout,R.id.textView_custom,listOfCities);
//        spinner_view.setAdapter(spinner_array_adapter);
//
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if(keyCode==KeyEvent.KEYCODE_BACK )
//        {
//            if(webview.canGoBack())
//            {
//                webview.goBack();
//            }
//            return false;
//        }
//        else
//        {
//            return super.onKeyDown(keyCode, event); //Default
//        }
//    }
//
//    public void onclic_method(View view) {
//
//        if(view.getId()==R.id.yes_radio)
//        {
//            RadioButton radioButton=(RadioButton)view;
//            if(radioButton.isChecked()){
//                Log.d("onclic_method","Yes "+radioButton.isChecked());
//            }
//        }
//        else if(view.getId()==R.id.no_radio)
//        {
//            RadioButton radioButton=(RadioButton)view;
//            if(radioButton.isChecked()){
//                Log.d("onclic_method","No "+radioButton.isChecked());
//            }
//        }
//
//    }
//}
