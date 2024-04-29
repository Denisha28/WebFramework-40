package com.example.denicw1.denicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.denicw1.denimodel.deniBook;
import com.example.denicw1.deniservice.deniBookService;

@RestController
public class deniBookController {
    @Autowired
    private deniBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<deniBook> getBookById(@PathVariable Long bookId) {
        deniBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
