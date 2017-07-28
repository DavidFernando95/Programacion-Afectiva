

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_estructura_de_datos;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
        System.out.println("Escriba el primer numero");
        numero1 = entrada.nextInt();
        
        System.out.println("Escriba el segundo numero");
        numero2 = entrada.nextInt();
        suma = numero1 + numero2;
        System.out.println("la suma es:",suma);
    }
    
}
