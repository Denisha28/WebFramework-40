package com.example.denicw2.denicontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.denicw2.denimodel.deniBook;
import com.example.denicw2.deniservice.deniBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class deniBookController {
    @Autowired
    deniBookService bookService;

    @PostMapping("/api/book")
    public deniBook addBook(@RequestBody deniBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public deniBook updateBook(@PathVariable int id,@RequestBody deniBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<deniBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<deniBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
