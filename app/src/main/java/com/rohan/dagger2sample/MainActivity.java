package com.rohan.dagger2sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.rohan.dagger2sample.car.Car;
import com.rohan.dagger2sample.dagger.ActivityComponent;
import com.rohan.dagger2sample.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*ActivityComponent component = DaggerActivityComponent.builder().appComponent(((ExampleApp) getApplication()).appComponent())
                .engineCapacity(100)
                .horsePower(200)
                .build();*/

        ActivityComponent component = ((ExampleApp) getApplication()).appComponent().getActivityComponentFactory().create(100, 150);
        //car = carComponent.getCar();
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}