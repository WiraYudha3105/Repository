package com.interview.wira.repository;

import com.interview.wira.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    @Query(nativeQuery = true, value = "SELECT * FROM mst_book m")
    public List<Book> findAllProduct();

    @Query(nativeQuery = true, value = "SELECT * FROM mst_book m where id = :id")
    public Book findIdProduct(String id);
}
