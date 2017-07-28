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
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Ingrese horas: ");
        Scanner obj=new Scanner(System.in);
        int h=obj.nextInt();
        int s=h*10;
        int B1=0, B2=0;
        if(s>200){
            B1=20;
        }
        if(h>=25){
            B2=20;
        }
        System.out.print("Sueldo por horas: "+s);
        int Bt=B1+B2+s;
        System.out.print("Sueldo mas incremento: "+Bt);
        
    }
    
    
}
