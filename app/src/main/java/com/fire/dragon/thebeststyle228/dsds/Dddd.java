package com.fire.dragon.thebeststyle228.dsds;

import android.content.Intent;
import android.provider.Settings;

import com.fire.dragon.thebeststyle228.MainActivity;

import java.util.Random;

public class Dddd {

    public static int dddd(FD fd){

        Random random = new Random();
        int i = random.nextInt(5);
        int c = 1;
        for (int a = 0; a < i; a++){
            c = random.nextInt(20);
        }

        int kdsd = Settings.Secure.getInt(fd.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        return kdsd;
    }

    public static void ssss(FD fd){

        String as = "22";
        String ghk = "235";
        String hfkf = "757";
        String [] hfh = {as,ghk,hfkf};
        String ggg;
        StringBuilder stringBuildersd = new StringBuilder();
        for (int i = 0 ; i<hfh.length; i++){
            stringBuildersd.append(hfkf);
        }
        ggg = stringBuildersd.toString();


        fd.startActivity(new Intent(fd.getApplicationContext(), MainActivity.class));
        fd.finishAffinity();

    }
}
