package com.rohan.dagger2sample.dagger;

import com.rohan.dagger2sample.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    private String name;

    public DriverModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    Driver providesDriver(){
        return new Driver(name);
    }
}
