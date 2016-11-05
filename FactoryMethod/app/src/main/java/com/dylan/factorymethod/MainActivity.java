package com.dylan.factorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cook();
    }

    private void cook() {
        //蒸鱼
        CookFishFactory cookSteamFish = new CookSteamFishFactory();
        Fish steamFish = cookSteamFish.getFish();
        steamFish.cook();

        //炖鱼
        CookFishFactory cookStewFish = new CookStewFishFactory();
        Fish stewFish = cookStewFish.getFish();
        stewFish.cook();

        //油炸鱼
        CookFishFactory cookFryFish = new CookFryFishFactory();
        Fish fryFish = cookFryFish.getFish();
        fryFish.cook();
    }
}
