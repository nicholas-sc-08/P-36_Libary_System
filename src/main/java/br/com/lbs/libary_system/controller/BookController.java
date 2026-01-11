package br.com.lbs.libary_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.lbs.libary_system.model.Book;
import br.com.lbs.libary_system.service.BookService;

@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{title}")
    public ResponseEntity<Book> getBookByTitle(@PathVariable String title) {
        Book book = bookService.getBookByTitle(title);

        if(book != null) {
            return ResponseEntity.ok().body(book);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/book")
    public ResponseEntity<Book> createNewBook(@RequestBody Book book) {
        Book newBook = bookService.createNewBook(book);
        return ResponseEntity.ok().body(newBook);
    }

    @DeleteMapping("/book/{title}")
    public ResponseEntity<?> deleteBook(@PathVariable String title) {
        bookService.deleteBook(title);
        return ResponseEntity.noContent().build();
    }
}
