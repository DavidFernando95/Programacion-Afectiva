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
public class Arreglo_Votacion {

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
            v=vote.nextInt();
            votos[i]=v;
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
        System.out.println("Estos son los resultados");
        System.out.println("-------------------------");
        System.out.println("Lasso:  "+L);
        System.out.println("Moreno:  "+M);
        System.out.println("Blanco:  "+B);
        System.out.println("Nulo:  "+N);
        System.out.println("-------------------------");
        int LV=0;
        int MV=0;
        int BV=0;
        int NV=0;
        for (int i=0; i < nv; i++){
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
        System.out.println("Estos son los resultados de la verificacion");
        System.out.println("-------------------------");
        System.out.println("Lasso:  "+LV);
        System.out.println("Moreno:  "+MV);
        System.out.println("Blanco:  "+BV);
        System.out.println("Nulo:  "+NV);
        System.out.println("-------------------------");
        float pl=(L*100)/nv;
        float pm=(M*100)/nv;
        float pb=(B*100)/nv;
        float pn=(N*100)/nv;
        System.out.println("Estos son los resultados de porcentages");
        System.out.println("-------------------------");
        System.out.println("Lasso:  "+pl+"%");
        System.out.println("Moreno:  "+MV+"%");
        System.out.println("Blanco:  "+BV+"%");
        System.out.println("Nulo:  "+NV+"%");
        System.out.println("-------------------------");
    }
}
                                                            