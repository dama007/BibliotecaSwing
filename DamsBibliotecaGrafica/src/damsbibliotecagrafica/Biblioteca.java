
package damsbibliotecagrafica;

import modelo.ListaLibros;
import utilidades.Fichero;
import vista.Menu;

/**
 *
 * @author kinky
 */
public class Biblioteca {

    public static Fichero miFichero;
    public static ListaLibros misLibros;
    
    
    public static void main(String[] args) {

        
        miFichero = new Fichero("biblioteca.xml");
        misLibros = (ListaLibros) miFichero.leer();
        
        if(misLibros == null) {
            misLibros = new ListaLibros();
        } 
        
        Menu m = new Menu();
        m.setExtendedState(6);
        m.setVisible(true);
        
    }
    
}
