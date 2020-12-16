package com.saimobileapps.learning;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CustomWebViewClientHelper extends WebViewClient {

    Activity activity;
    public CustomWebViewClientHelper(Activity activity)
    {
        this.activity=activity;
    }
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {

        super.onPageStarted(view, url, favicon);
        if(url.contains("getLocation:"))
        {
            //Fetch user locatio.
        }
        Log.d("CustomWebViewClientHelper","onPageStarted");

    }

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Log.d("CustomWebViewClientHelper","onPageFinished");
        //view.loadUrl("javascript: document.getElementById('from').style.display='red'; ");
        view.loadUrl(activity.getResources().getString(R.string.js_change_signin_button_color));
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Log.d("CustomWebViewClientHelper","shouldOverrideUrlLoading");
//        if( request.getUrl().toString().contains("refsrc=https%3A%2F%2Fwww.facebook.com%2F&_rdr")||request.getUrl().toString().contains("recover"))
//        {
//            return super.shouldOverrideUrlLoading(view, request);
//        }
//        else
//        {
//            return true;
//        }
        return super.shouldOverrideUrlLoading(view, request);
    }
}
