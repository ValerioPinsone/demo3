package com.example.demo3.Service;

import com.example.demo3.Repository.LibroRepository;
import com.example.demo3.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    LibroRepository lbr;

    public List<Libro> getAll(){
        return lbr.findAll();
    }


    public Libro findById(int p){
        return lbr.findById(p).orElse(new Libro());
    }


}
