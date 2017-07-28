/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo3;

/**
 *
 * @author Usuario
 */
public class Arreglo3 {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String args []) {
        // TODO code application logic here
        final int LONGITUD_ARREGLO = 10;
        int arreglo[] = new int [10];
        for ( int contador = 0; contador < arreglo.length; contador++ )
            arreglo [ contador ] = 2+2*contador;
        System.out.printf( "d5d85\n", "Indice", "Valor");
        for (int contador=0; contador < arreglo.length; contador++)
            System.out.printf("d5d85\n", contador );
    }
    
}
