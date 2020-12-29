package com.rohan.dagger2sample.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.d(TAG, "Remote Connected");
    }
}
