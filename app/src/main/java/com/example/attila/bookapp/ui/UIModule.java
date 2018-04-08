package com.example.attila.bookapp.ui;

import android.content.Context;

import com.example.attila.bookapp.ui.list.BookListPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public BookListPresenter provideBookListPresenter() {
        return new BookListPresenter();
    }
}
