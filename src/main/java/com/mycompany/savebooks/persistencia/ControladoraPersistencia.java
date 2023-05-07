/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.savebooks.persistencia;

import com.mycompany.savebooks.logica.Libro;
import com.mycompany.savebooks.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emili
 */
public class ControladoraPersistencia {
    LibroJpaController libroJpa = new LibroJpaController();

    public void agregarLibro(Libro libro) {
        libroJpa.create(libro);
    }

    public List<Libro> traerLibros() {
        return libroJpa.findLibroEntities();
    }

    public void borrarLibro(int idLibro) {
            try {
            libroJpa.destroy(idLibro);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Libro traerLibro(int idLibro) {
        return libroJpa.findLibro(idLibro);
    }

    public void editLibro(Libro libro) {
        try {
            libroJpa.edit(libro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
