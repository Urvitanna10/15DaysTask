package com.example.a15daystasks.task6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import com.example.a15daystasks.R;

public class WebActivity extends AppCompatActivity implements View.OnClickListener {
    EditText search;
    Button go;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        search=(EditText)findViewById(R.id.Search);
        go=(Button)findViewById(R.id.go);
        webView=(WebView)findViewById(R.id.webview);
        go.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.go:
                String url= search.getText().toString();
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new MyWebViewClient());
                webView.loadUrl(url);
                break;
        }
    }
    private class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}