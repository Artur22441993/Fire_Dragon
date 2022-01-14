package com.fire.dragon.thebeststyle228;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.appsflyer.AppsFlyerLib;
import com.fire.dragon.thebeststyle228.dsds.Apppppppp;
import com.fire.dragon.thebeststyle228.dsds.FD;
import com.fire.dragon.thebeststyle228.dsds.kh.Ffs;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView spin, imageChanges1,imageChanges2,imageChanges3;
    private TextView textNumbers;
    private Handler handler;
    private int a = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        spin = findViewById(R.id.spin);
        imageChanges1 = findViewById(R.id.imageChanges1);
        imageChanges2 = findViewById(R.id.imageChanges2);
        imageChanges3 = findViewById(R.id.imageChanges3);
        textNumbers = findViewById(R.id.textNumbers);
        handler = new Handler();



        spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int min = 600;
                int max = 800;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1);
                i += min;
                textNumbers.setText("" + i);

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Random randomImage1 = new Random();
                        int i = randomImage1.nextInt(4);
                        switch (i){
                            case 0:
                                imageChanges1.setImageResource(R.drawable.ic_slot_1);
                                break;
                            case 1:
                                imageChanges1.setImageResource(R.drawable.ic_slot_2);
                                break;
                            case 2:
                                imageChanges1.setImageResource(R.drawable.ic_slot_3);
                                break;
                            case 3:
                                imageChanges1.setImageResource(R.drawable.ic_slot_4);
                                break;
                        }
                        a++;
                        if (a!=40) {
                            handler.postDelayed(this::run, 10);
                        }else{
                            a=0;
                        }

                    }

                });
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Random randomImage1 = new Random();
                        int i = randomImage1.nextInt(4);
                        switch (i){
                            case 0:
                                imageChanges2.setImageResource(R.drawable.ic_slot_1);
                                break;
                            case 1:
                                imageChanges2.setImageResource(R.drawable.ic_slot_2);
                                break;
                            case 2:
                                imageChanges2.setImageResource(R.drawable.ic_slot_3);
                                break;
                            case 3:
                                imageChanges2.setImageResource(R.drawable.ic_slot_4);
                                break;
                        }
                        a++;
                        if (a!=40) {
                            handler.postDelayed(this::run, 10);
                        }else{
                            a=0;
                        }

                    }

                });
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Random randomImage1 = new Random();
                        int i = randomImage1.nextInt(4);
                        switch (i){
                            case 0:
                                imageChanges3.setImageResource(R.drawable.ic_slot_1);
                                break;
                            case 1:
                                imageChanges3.setImageResource(R.drawable.ic_slot_2);
                                break;
                            case 2:
                                imageChanges3.setImageResource(R.drawable.ic_slot_3);
                                break;
                            case 3:
                                imageChanges3.setImageResource(R.drawable.ic_slot_4);
                                break;
                        }
                        a++;
                        if (a!=40) {
                            handler.postDelayed(this::run, 10);
                        }else{
                            a=0;
                        }

                    }

                });

            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void onS(Apppppppp apppppppp, String oooip){
        String sd = FD.ddddeee(oooip);
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(apppppppp.getApplicationContext());
        OneSignal.setAppId(sd);
    }

    public static String aai(Apppppppp apppppppp) throws Exception{
       String fhdk = AdvertisingIdClient.getAdvertisingIdInfo(apppppppp.getApplicationContext()).getId();
       return fhdk;
    }

    public static String jf(Apppppppp apppppppp){
        String fjds = AppsFlyerLib.getInstance().getAppsFlyerUID(apppppppp.getApplicationContext());
        return fjds;
    }


}