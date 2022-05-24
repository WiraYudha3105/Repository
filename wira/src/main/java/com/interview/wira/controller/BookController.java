package com.interview.wira.controller;

import com.interview.wira.constant.APIURLConstant;
import com.interview.wira.entity.Book;
import com.interview.wira.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(APIURLConstant.BOOKS)
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/{id}")
    public Book getIdBook (@PathVariable String id) {
        return bookService.getBookById(id);
    }

    @GetMapping
    public List<Book> getAllBook (){
        return bookService.getAllBook();
    }

    @DeleteMapping("/{id}")
    public void deleteBook (@PathVariable String id){
        bookService.deleteBook(id);
    }

    @PostMapping
    public Book saveBook (@RequestBody Book book){
       return bookService.saveBook(book);
    }

    @PutMapping
    public void updateBook(@RequestBody Book book){
        bookService.saveBook(book);
    }



}
