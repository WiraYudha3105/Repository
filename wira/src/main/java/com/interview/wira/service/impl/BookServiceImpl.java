package com.interview.wira.service.impl;

import com.interview.wira.entity.Book;
import com.interview.wira.repository.BookRepository;
import com.interview.wira.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;


    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(String id) {
        return bookRepository.findIdProduct(id);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAllProduct();
    }
}
