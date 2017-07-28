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
public class Sueldo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Ingrese horas: ");
        Scanner lec=new Scanner(System.in);
        int h= lec.nextInt();
        int S=60;
        int SM=0;
        int ST=0;
        int SB=0;
        int SMin;
        int SH=h*10;
        if (h<5){
            SM=S-3;
            System.out.println("Sueldo"+S);
            System.out.println("Sueldo menos Multa"+SM);
        }
        if (h>6){
            SB=SH+2;
            System.out.println("Sueldo"+SH);
            System.out.println("Sueldo mas bono"+SB);            
        }
        if (h>=5 && h<=6){
            SMin=S;
            System.out.println("Sueldo Basico por trabajo de 5 a 6 horas"+SMin);
        }
    }
}
