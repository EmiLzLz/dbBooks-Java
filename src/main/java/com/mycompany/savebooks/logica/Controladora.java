/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.savebooks.logica;

import com.mycompany.savebooks.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author emili
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarLibro(String titulo, String autor, String editorial, int paginas) {
        
        Libro libro = new Libro();
        
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setPaginas(paginas);
        
        controlPersis.agregarLibro(libro);
    }

    public List<Libro> traerLibros() {
        return controlPersis.traerLibros();
    }

    public void borrarLibro(int idLibro) {
        controlPersis.borrarLibro(idLibro);
    }

    public Libro traerLibro(int idLibro) {
        return controlPersis.traerLibro(idLibro);
    }

    public void editLibro(Libro libro, String titulo, String autor, String editorial, int paginas) {
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setPaginas(paginas);
        
        //PERSISTENCIA MODIFICA
        controlPersis.editLibro(libro);
    }
    
}
