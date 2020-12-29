package com.rohan.dagger2sample.car;

import android.util.Log;

import com.rohan.dagger2sample.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    //@Inject Engine engine;
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

/*    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }*/

/*    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }*/

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        engine.start();
        Log.d(TAG, driver +" "+ driver.name + " drives " + this);
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}
