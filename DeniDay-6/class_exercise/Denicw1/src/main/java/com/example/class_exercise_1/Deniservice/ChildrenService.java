package com.example.Denicw1.Deniservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.Denicw1.Denimodel.DeniChildren;
import com.example.Denicw1.Denirepository.DeniChildrenRepo;

@Service
public class ChildrenService {

     @Autowired
     public DeniChildrenRepo childrenRepo;

     public List<DeniChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public DeniChildren save(DeniChildren children) {
          return childrenRepo.save(children);

     }

     public List<DeniChildren> sortedPage(int offset, int pagesize, String field) {
          Page<DeniChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<DeniChildren> pagination(int offset, int pagesize) {
          Page<DeniChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
