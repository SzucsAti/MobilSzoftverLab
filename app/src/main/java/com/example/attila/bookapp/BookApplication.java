package com.example.attila.bookapp;

import android.app.Application;

import com.example.attila.bookapp.ui.UIModule;

public class BookApplication extends Application {

    public static BookApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerBookApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }
}
