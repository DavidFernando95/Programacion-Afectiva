/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_estructura_de_datos;

/**
 *
 * @author Usuario
 */
public class Examen_Estructura_de_Datos {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        int NumR[]= new int[100];
        int numero=-25; 
        System.out.println("100 Numeros de rango -25,+25");
        for (int i = 0; i < 100; i++) {
            NumR[i]=numero;
            if (i>50) {
                numero--;
                System.out.println(numero);
            }
            else{
            numero++;
            System.out.println(numero);
            }

      }
        
    }
    
}
