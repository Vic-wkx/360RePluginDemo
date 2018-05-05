package com.sample.test360replugin;

import android.app.Application;
import android.content.Context;

import com.qihoo360.replugin.RePlugin;

public class MyApplication extends Application{
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        RePlugin.App.attachBaseContext(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        RePlugin.App.onCreate();
    }
//    minSdkVersion > 14 就不需要添加以下几行
//    @Override
//    public void onLowMemory() {
//        super.onLowMemory();
//        RePlugin.App.onLowMemory();
//    }
//
//    @Override
//    public void onTrimMemory(int level) {
//        super.onTrimMemory(level);
//        RePlugin.App.onTrimMemory(level);
//    }
//
//    @Override
//    public void onConfigurationChanged(Configuration config) {
//        super.onConfigurationChanged(config);
//        RePlugin.App.onConfigurationChanged(config);
//    }
}
