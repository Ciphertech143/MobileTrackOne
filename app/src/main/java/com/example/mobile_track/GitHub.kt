package com.example.mobile_track;

import android.app.Activity;
import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity

class GitHub : ComponentActivity() {
    private lateinit var webview: WebView
    private var URL="https://github.com/Ciphertech143"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)

        webview=findViewById(R.id.wbv)

        webview.apply{
            loadUrl(URL)
        }

    }
}
