package com.fire.dragon.thebeststyle228.dsds;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.fire.dragon.thebeststyle228.R;
import com.fire.dragon.thebeststyle228.dsds.kh.Ffs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class FD extends Activity {
    WebView wdsdsd;
    String jug;
    String qwsa;
    String lono;
    String qwx = null;
    public ValueCallback<Uri> pomvnh;
    public Uri asdcjkih = null;
    public ValueCallback<Uri[]> kiuhg;
    public String juybt;
    public static final int njuyhgf = 1;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.fd);

        wdsdsd = findViewById(R.id.wdsdsd);
        int hgf = Dddd.dddd(this);

        if (hgf == 0){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String sas = cococ();
                        String [] jkfd = jfdf(sas);
                        oil(jkfd);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Ffs ffs = new Ffs();
                                ffs.setDj(lono);
                                ffs.setFd(FD.this);
                                ffs.fsc();
                                ffs.gkfd();

                                qwx = fjdf();
                                if (qwx.equals("dsdsd")){
                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            sssty();
                                        }
                                    },5000);
                                }else {
                                    Ffs.srs(wdsdsd,FD.this);
                                    wdsdsd.loadUrl(qwx);
                                }
                            }
                        });

                    }catch (Exception e){

                        Dddd.ssss(FD.this);
                    }

                }
            }).start();


        }else {
            Dddd.ssss(this);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String fjdf(){
        String dsd = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(FD.ddddeee("c2F2ZWRVcmw="), "dsdsd");
        return  dsd;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private String cococ()throws Exception{
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ddddeee(Apppppppp.fffsd)).openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String ssssscc = bufferedReader.readLine();
        return ssssscc;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String ddddeee(String kdsd){
        Base64.Decoder ljdso = Base64.getDecoder();
        String ljfdsa = new String(ljdso.decode(kdsd));
        return ljfdsa;
    }

    private String [] jfdf(String hdsl){
        String [] fffds = hdsl.split("\\\u007C");
        return fffds;
    }
    private void oil(String [] fd){
        jug = fd[0];
        qwsa = fd[1];
        lono = fd[2];
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != njuyhgf || kiuhg == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        filePath(resultCode, data);
        if (pomvnh == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        setResults(resultCode, data);
    }



    @Override
    public void onBackPressed() {
        if (wdsdsd.isFocused() && wdsdsd.canGoBack()) {
            wdsdsd.goBack();
        }
    }

    private void setResults(int resultCode, Intent data) {
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? asdcjkih : data.getData();
            }
        } catch (Exception e) { }
        pomvnh.onReceiveValue(result);
        pomvnh = null;
    }
    private void filePath(int resultCode, Intent data){

        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (juybt != null) {
                    results = new Uri[]{Uri.parse(juybt)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        kiuhg.onReceiveValue(results);
        kiuhg = null;
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private void sssty(){
        Ffs.srs(wdsdsd,this);
        Ffs.uuurt(wdsdsd,this, jug, qwsa);

        String a = "ddkds";
        String hg = "fss";
        String kfdj = "jds";

        String d = a+hg+kfdj;
    }
}
