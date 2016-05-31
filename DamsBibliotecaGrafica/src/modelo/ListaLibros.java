
package modelo;

import modelo.Libro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kinky
 */
public class ListaLibros implements Serializable {
       
    private ArrayList<Libro> lista;

    
    public ArrayList<Libro> getLista() {
        return lista;
    }

  

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }

    public ListaLibros() {    
      lista = new ArrayList<>();  
    }
    
    public void altaLibro(Libro l) {
        lista.add(l);
    }
    
    
    public void borrarLibro(Libro l) {
        lista.remove(l);
    }
    
    public boolean existe(Libro l) {
       return lista.contains(l);
    }
    
    
    public ListaLibros librosPorGenero(String genero) {
        ListaLibros librosGen = new ListaLibros();
        for (Libro l : lista) {
            if (genero.equalsIgnoreCase(l.getGenero())) {
                librosGen.altaLibro(l);
            }
        }
        return librosGen;
    }
    
    
    public ArrayList<String> generos() {
        ArrayList<String> gen = new ArrayList<>();
        for (Libro l : lista) {
            if (!gen.contains(l.getGenero())) {
                gen.add(l.getGenero());
            }
        }
        return gen;
    }
    
    
    
    

    
}
