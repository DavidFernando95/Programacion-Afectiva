;
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int logarrg = 9;
        int arreglo[] = new int [logarrg];
        for (int  contador = 0; contador < arreglo.length; contador++)
            arreglo[contador]=2+4*contador;
        System.out.printf("%5%8s", "indice","Valor");
        for (int contador=0; contador<arreglo.length; contador++)
            System.out.printf("%5d%8d\n",contador, arreglo [contador]);
    }
    
    
}
