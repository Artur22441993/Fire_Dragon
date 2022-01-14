package com.fire.dragon.thebeststyle228.dsds.kh;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.fire.dragon.thebeststyle228.dsds.FD;

public class WebChrome extends WebChromeClient {

    FD fd;

    public WebChrome(FD fd) {
        this.fd = fd;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> gd,
                                     FileChooserParams fileChooserParams) {
        if (fd.kiuhg != null) {
            fd.kiuhg.onReceiveValue(null);
        }
        fd.kiuhg = gd;
        Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
        contentSelectionIntent.setType("*/*");
        Intent[] loynv = new Intent[0];
        Intent uddaw = new Intent(Intent.ACTION_CHOOSER);
        uddaw.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
        uddaw.putExtra(Intent.EXTRA_TITLE, FD.ddddeee("U2VsZWN0IE9wdGlvbjo="));
        uddaw.putExtra(Intent.EXTRA_INITIAL_INTENTS, loynv);
        fd.startActivityForResult(uddaw, 1);
        return true;
    }
}
