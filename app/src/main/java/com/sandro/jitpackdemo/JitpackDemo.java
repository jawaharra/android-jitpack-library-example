package com.sandro.jitpackdemo;

import android.util.Log;

public class JitpackDemo {

    public static void logEnvironment() {
        Log.d(JitpackDemo.class.toString(), BuildConfig.ENV);
    }
}
