package com.rohan.dagger2sample.dagger;

import com.rohan.dagger2sample.car.Engine;
import com.rohan.dagger2sample.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    /*@Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }*/

    @Binds
    abstract Engine bindsEngine(PetrolEngine engine);
}
