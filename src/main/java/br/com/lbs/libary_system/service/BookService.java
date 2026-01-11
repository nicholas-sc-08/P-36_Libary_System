package br.com.lbs.libary_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lbs.libary_system.model.Book;
import br.com.lbs.libary_system.repo.BookRepo;

@Service
public class BookService {
    
    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepo.findAll();
    }

    public Book getBookByTitle(String title) {
        return bookRepo.findByTitle(title);
    }

    public Book createNewBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBook(String title) {
        bookRepo.deleteByTitle(title);
    }
}
