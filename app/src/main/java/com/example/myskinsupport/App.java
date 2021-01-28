package com.example.myskinsupport;

import android.app.Application;

import com.enjoy.skin.lib.SkinManager;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.init(this);
    }
}
