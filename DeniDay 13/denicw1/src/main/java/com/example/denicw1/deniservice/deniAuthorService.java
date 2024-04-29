package com.example.denicw1.deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.denicw1.denimodel.deniAuthor;
import com.example.denicw1.denirepository.deniAuthorRepository;

@Service
public class deniAuthorService {
    @Autowired
    private deniAuthorRepository authorRepository;

    public deniAuthor saveAuthor(deniAuthor author) {
        return authorRepository.save(author);
    }

    public deniAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<deniAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public deniAuthor updateAuthor(Long id, deniAuthor author) {
        deniAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
