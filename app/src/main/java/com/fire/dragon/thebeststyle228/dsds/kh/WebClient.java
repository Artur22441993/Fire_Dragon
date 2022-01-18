package com.fire.dragon.thebeststyle228.dsds.kh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import com.fire.dragon.thebeststyle228.MainActivity;
import com.fire.dragon.thebeststyle228.dsds.FD;

public class WebClient extends WebViewClient {

    FD fd;

    public WebClient(FD fd) {
        this.fd = fd;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains("404")){
            fd.startActivity(new Intent(fd.getApplicationContext(), MainActivity.class));
            fd.finishAffinity();
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        fd.getSharedPreferences(fd.getPackageName(), fd.MODE_PRIVATE).edit().putString(FD.ddddeee("c2F2ZWRVcmw="),url).apply();
    }
}
