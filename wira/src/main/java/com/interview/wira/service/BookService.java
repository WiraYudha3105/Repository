package com.interview.wira.service;

import com.interview.wira.entity.Book;

import java.util.List;

public interface BookService {

    public void deleteBook(String id);

    public Book saveBook(Book book);

    public Book getBookById(String id);

    public List<Book> getAllBook();
}
