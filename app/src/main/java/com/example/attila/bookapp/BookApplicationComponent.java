package com.example.attila.bookapp;

import com.example.attila.bookapp.ui.UIModule;
import com.example.attila.bookapp.ui.list.BookListActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UIModule.class})
public interface BookApplicationComponent {
    void inject(BookListActivity bookListActivity);
}
