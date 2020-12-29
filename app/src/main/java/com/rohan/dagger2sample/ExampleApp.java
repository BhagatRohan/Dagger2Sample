package com.rohan.dagger2sample;

import android.app.Application;

import com.rohan.dagger2sample.dagger.AppComponent;
import com.rohan.dagger2sample.dagger.DaggerAppComponent;
import com.rohan.dagger2sample.dagger.DriverModule;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("Rohan"));
    }

    public AppComponent  appComponent(){
        return component;
    }
}
