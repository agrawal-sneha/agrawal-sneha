package com.cixelle.hvntwallet;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;




public class MainActivity extends AppCompatActivity {

    WebView web;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web=(WebView) findViewById(R.id.web_view);
        WebSettings webSettings= web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        //  web.setWebViewClient(new Callback());
        web.loadUrl("https://app.website.com/SignIn.aspx");

    }
    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        web=(WebView)findViewById(R.id.web_view);
        WebSettings webSettings= web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.setWebViewClient(new Callback());
        switch (item.getItemId()) {
            case R.id.signin:
                //  web.setWebViewClient(new Callback());
                web.loadUrl("https://app.website.com/SignIn.aspx/");
                //Toast.makeText(MainActivity.this, "SIGN IN", Toast.LENGTH_LONG).show();
                return true;
            case R.id.signup:

                //  web.setWebViewClient(new Callback());
                web.loadUrl("https://app.website.com/SignUp.aspx/");
                // Toast.makeText(MainActivity.this, "SIGN UP", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
    @Override
    public boolean onCreatePanelMenu ( int featureId, @NonNull Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


}



