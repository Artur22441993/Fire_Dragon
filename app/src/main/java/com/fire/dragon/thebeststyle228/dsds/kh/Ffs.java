package com.fire.dragon.thebeststyle228.dsds.kh;

import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.fire.dragon.thebeststyle228.dsds.Apppppppp;
import com.fire.dragon.thebeststyle228.dsds.Dddd;
import com.fire.dragon.thebeststyle228.dsds.FD;

public class Ffs {

    private String dj;
    private FD fd;
    public static String jdfdfq;
    public static String loujn;

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }

    public FD getFd() {
        return fd;
    }

    public void setFd(FD fd) {
        this.fd = fd;
    }

    public void fsc(){

        FacebookSdk.setApplicationId(dj);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(fd.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
    }

    public void gkfd(){

        AppEventsLogger.activateApp(fd.getApplication());
        AppLinkData.fetchDeferredAppLinkData(fd.getApplicationContext(),
                new AppLinkData.CompletionHandler() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onDeferredAppLinkDataFetched(AppLinkData oirhf) {
                        if (oirhf == null) {
                            oirhf = AppLinkData.createFromActivity(fd);
                        }
                        if (oirhf != null) {
                            Uri lojjn = oirhf.getTargetUri();
                            jdfdfq = lojjn.getQuery();
                            loujn = Apppppppp.pdpdp(jdfdfq,fd.getPackageName(), Apppppppp.oiurynd, Apppppppp.oindf);

                        }else {

                        }
                    }

                }
        );
    }

    public static void srs(WebView wewebVikdf,FD fd){
        wewebVikdf.getSettings().setAllowFileAccessFromFileURLs(true);

        CookieManager.getInstance().setAcceptThirdPartyCookies(wewebVikdf, true);
        CookieManager.getInstance().setAcceptCookie(true);
        wewebVikdf.setVisibility(View.VISIBLE);
        wewebVikdf.getSettings().setMixedContentMode(0);

        wewebVikdf.getSettings().setSavePassword(true);
        wewebVikdf.getSettings().setDatabaseEnabled(true);
        wewebVikdf.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        wewebVikdf.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        wewebVikdf.getSettings().setAppCacheEnabled(true);
        wewebVikdf.getSettings().setLoadsImagesAutomatically(true);
        wewebVikdf.setSaveEnabled(true);
        wewebVikdf.getSettings().setUseWideViewPort(true);
        wewebVikdf.getSettings().setSaveFormData(true);
        wewebVikdf.setFocusable(true);
        wewebVikdf.getSettings().setAllowUniversalAccessFromFileURLs(true);
        wewebVikdf.getSettings().setJavaScriptEnabled(true);
        wewebVikdf.getSettings().setAllowContentAccess(true);
        wewebVikdf.getSettings().setLoadWithOverviewMode(true);
        wewebVikdf.getSettings().setEnableSmoothTransition(true);

        wewebVikdf.getSettings().setAllowFileAccess(true);
        wewebVikdf.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wewebVikdf.getSettings().setDomStorageEnabled(true);
        wewebVikdf.setFocusableInTouchMode(true);
        wewebVikdf.setWebViewClient(new WebClient(fd));
        wewebVikdf.setWebChromeClient(new WebChrome(fd));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uuurt(WebView wewe, FD fd, String loikj, String qqqws){

        String pppp = Apppppppp.loiunds;
        String xxxx = null;
        if (pppp.equals(FD.ddddeee("Tm9uLW9yZ2FuaWM="))){
            xxxx = loikj + Apppppppp.pppppqpqp;
            wewe.loadUrl(xxxx);
        }else if(jdfdfq != null) {
            xxxx = loikj + loujn;
            wewe.loadUrl(xxxx);
        }else {
            if (qqqws.equals(FD.ddddeee("Tk8="))) {
                Dddd.ssss(fd);
            }else {
                String poiuybndq = qqqws + FD.ddddeee("P2J1bmRsZT0=") + fd.getPackageName() + FD.ddddeee("JmFkX2lkPQ==") + Apppppppp.oiurynd + FD.ddddeee("JmFwcHNfaWQ9") + Apppppppp.oindf;
                xxxx = loikj + poiuybndq;
                wewe.loadUrl(xxxx);
            }
        }
    }
}
