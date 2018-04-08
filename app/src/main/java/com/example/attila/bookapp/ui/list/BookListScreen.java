package com.example.attila.bookapp.ui.list;

import com.example.attila.bookapp.model.Book;

public interface BookListScreen {

    public void createBook(Book book);
    public void deleteBook(Book book);
    public void toDetails(Book book);
}
