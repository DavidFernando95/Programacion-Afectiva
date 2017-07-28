import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[]={ 0,0,0,0,0,0,1,2,4,2,1};
        System.out.println("Distribucion de calificaciones");
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            if ( contador ==10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02: ", 
                    contador * 10, contador*10+9);
            for( int estrellas=0; estrellas < arreglo[contador]; estrellas++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
