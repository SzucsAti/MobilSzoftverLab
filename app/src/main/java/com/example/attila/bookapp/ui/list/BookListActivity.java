package com.example.attila.bookapp.ui.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.attila.bookapp.BookApplication;
import com.example.attila.bookapp.R;
import com.example.attila.bookapp.model.Book;

import javax.inject.Inject;

public class BookListActivity extends AppCompatActivity implements BookListScreen{

    @Inject
    BookListPresenter bookListPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        BookApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        bookListPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        bookListPresenter.detachScreen();
    }

    @Override
    public void createBook(Book book) {

    }

    @Override
    public void deleteBook(Book book) {

    }

    @Override
    public void toDetails(Book book) {

    }
}
