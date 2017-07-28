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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int L=0;
        int M=0;
        int B=0;
        int N=0;
        int v=0;
        System.out.print("Ingrese el numero de Votos");
        Scanner vote=new Scanner(System.in);
        int nv = vote.nextInt();
        int [] votos=new int [nv];
        for (int i=0; i < nv; i++){
        System.out.println("ingrese 1:Lasso 2:Moreno 3:Blanco 4:Nulo");
            v=votos[i];
            if (v==1){
                L=L+1;
            }
            if (v==2){
                M=M+1;
            }
            if (v==3){
                B=B+1;
            }
            if (v==4){
                N=N+1;
            }
        }
        float pL=(L*100)/nv;
        float pM=(M*100)/nv;
        float pB=(B*100)/nv;
        float pN=(N*100)/nv;
        System.out.println("Estos son los resultados de porcentages");
        System.out.println("-------------------------");
        System.out.println("Lasso:  "+pL+"%");
        System.out.println("Moreno:  "+pM+"%");
        System.out.println("Blanco:  "+pB+"%");
        System.out.println("Nulo:  "+pN+"%");
        System.out.println("-------------------------");
    }
}
