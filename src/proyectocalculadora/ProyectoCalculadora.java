/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

/**
 *
 * @author Best Buy Uptown
 */
public class ProyectoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Calculadora miCalculadora =new Calculadora (10,2);
     int suma = miCalculadora.sumar();
     
     System.out.println("La suma es: "+ suma);
     System.out.println("La resta es: "+ miCalculadora.restar());
     System.out.println("La multiplicación es: "+ miCalculadora.multiplicar());
     System.out.println("La división es: "+ miCalculadora.dividir());
    }
}
