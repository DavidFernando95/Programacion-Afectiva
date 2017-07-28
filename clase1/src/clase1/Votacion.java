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
public class Votacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Elijir opcion:  Registrar Voto(1) - Salir (2)");
        Scanner lec=new Scanner(System.in);
        int Opc= lec.nextInt();
        int L=0;
        int M=0;
        int B=0;
        int N=0;
        int total_votos=0;
        while (Opc ==1){
            System.out.print("Ingresar voto: (1) Lasso - (2) Moreno - (3) Blanco - (4) Nulo");
            Scanner lec1=new Scanner(System.in);
            int V=lec1.nextInt();
            if (V == 1){
                L = L+1;
            }
            if (V == 2){
                M = M+1;
            }
            if (V == 3){
                B = B+1;
            }
            if (V == 4){
                N = N+1;
            }
            total_votos++;
            Opc= lec.nextInt();
        }
        System.out.print("lasso"+L);
        System.out.print("Moreno"+M);
        System.out.print("Blanco"+B);
        System.out.print("Nulo"+N);
            
    }
}
