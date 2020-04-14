package com.loom.emtlab1.services;

import com.loom.emtlab1.models.Book;
import com.loom.emtlab1.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public void addBook(Book book) {
        bookRepo.dodajKniga(book);
    }

    public Book getBookById(Long bookId) {
        return bookRepo.zemiKniga(bookId);
    }

    public List<Book> getAllBooks() {
        return bookRepo.zemiGiSiteKnigi();
    }

    public void updateBook(Long bookId, Book book) {
        bookRepo.izmeniKniga(bookId, book);
    }

    public void deleteBookById(Long bookId) {
        bookRepo.izbrishiKniga(bookId);
    }
}
