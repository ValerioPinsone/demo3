package com.example.demo3.Repository;

import com.example.demo3.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Integer> {

    //@Query("from Libro l join autore a on l.autore.id = a.id where a.cognome = :cognome")
    // List<Libro> filtraAutore(String cognome);

}
