package com.tahminbudur.tahminbudur;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private static String TAHMINBUDUR_URL = "http://m.tahminbudur.com/Uygulama/Uygulama_Default_hadsh87ada54fs778d.aspx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WebView mainWebView = (WebView) findViewById(R.id.mainWebView);

        mainWebView.loadUrl(TAHMINBUDUR_URL);
        mainWebView.getSettings().setJavaScriptEnabled(true);
        mainWebView.getSettings().setDomStorageEnabled(true);
        mainWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
    }
}
