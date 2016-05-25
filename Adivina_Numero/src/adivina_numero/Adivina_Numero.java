/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina_numero;

/**
 *
 * @author kinky
 */
import java.util.*;
public class Adivina_Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int aleatorio;
        aleatorio = (int)(Math.random()*100);
            Scanner entrada = new Scanner(System.in);
            int numero = 0;
            int intentos = 0;
            intentos++;
            while(numero != aleatorio) {
                
                
                System.out.println("Introduce un numero por fa");
                numero = entrada.nextInt();
                if(aleatorio < numero){
                    System.out.println("Más bajo");
                }
                else if(aleatorio > numero) {
                    System.out.println("Más alto");
                }
            }
            System.out.println("Correcto. Lo has conseguido en: " +  intentos + "intentos.");
    }
    
}
