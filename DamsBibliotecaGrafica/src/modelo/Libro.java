
package modelo;

import java.io.Serializable;

/**
 *
 * @author kinky
 */
public class Libro implements Serializable {
    
    private String codigo;    
    private String titulo;    
    private String autor;    
    private int numPaginas;    
    private String genero;    
    private double coste;    
    private boolean prestamo;

    
    public Libro() {
        this.codigo = codigo;
        this.titulo = codigo;
        this.autor = autor;
        this.genero = genero;
    }

    public Libro(String codigo, String titulo, String autor, int numPaginas, String genero, double coste, boolean prestamo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.coste = coste;
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return titulo ;
    }
    
    
    
    
    
    
    

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }


    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}
