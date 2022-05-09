package dev.book.bookorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.book.bookorder.model.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    Book findByName(String name);
    
}
