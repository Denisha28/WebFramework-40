package com.example.denicw1.deniservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.denicw1.denimodel.deniAuthor;
import com.example.denicw1.denimodel.deniBook;
import com.example.denicw1.denirepository.deniAuthorRepository;
import com.example.denicw1.denirepository.deniBookRepository;

@Service
public class deniBookService {
    @Autowired
    private deniBookRepository bookRepository;
@Autowired
private deniAuthorRepository authorRepository;
    public deniBook saveBook(Long authorId, deniBook book) {
        deniAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public deniBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

