/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Potencia {
    
    public int pot;
    public int base;
    public int exp;
    
    public Potencia (){
    this pot = pot;
    this base = base;
    this exp = exp;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese Base");
        Scanner B =new Scanner(System.in);
        int base =B.nextInt();
        System.out.println("Ingrese Exponente");
        Scanner E =new Scanner(System.in);
        int exp =E.nextInt();
        pot=CalcularPotencia;
        System.out.println("Exponente es: ");
        
    }
    
}
