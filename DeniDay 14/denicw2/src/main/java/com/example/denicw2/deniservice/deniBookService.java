package com.example.denicw2.deniservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.denicw2.denimodel.deniBook;
import com.example.denicw2.denirepository.deniBookRepo;

@Service
public class deniBookService {
   @Autowired
   deniBookRepo bookRepo;

   public deniBook addBook(deniBook book)
   {
        return bookRepo.save(book);
   }

   public List<deniBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<deniBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public deniBook updateBook(int id,deniBook book)
   {
        deniBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else
        return null;
   }
}
