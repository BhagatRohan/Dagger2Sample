package com.rohan.dagger2sample.dagger;

import com.rohan.dagger2sample.car.DieselEngine;
import com.rohan.dagger2sample.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }

/*    @Provides
    Engine provideEngine(){
        return new DieselEngine(horsePower);
    }*/

    /*@Binds
    abstract Engine bindsEngine(DieselEngine engine);*/
}
