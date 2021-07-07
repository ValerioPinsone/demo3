package com.example.demo3.Controller;

import com.example.demo3.Service.LibroService;
import com.example.demo3.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class libroController {
    @Autowired
    LibroService lbrs;

    @GetMapping("/libri")
    public List<Libro> getAll(){
        return lbrs.getAll();
    }

    @GetMapping("/libri/{id}")
    public Libro findById(@PathVariable Integer id){
        return lbrs.findById(id);
    }


}
