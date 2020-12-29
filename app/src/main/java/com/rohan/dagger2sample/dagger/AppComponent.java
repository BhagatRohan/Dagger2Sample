package com.rohan.dagger2sample.dagger;

import com.rohan.dagger2sample.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = DriverModule.class)
@Singleton
public interface AppComponent {

   // Driver getDriver();

    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{
        AppComponent create(DriverModule driverModule);
    }
}
