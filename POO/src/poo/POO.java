/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Usuario
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enteros op=new Enteros();
        op.setValor(1);
        Enteros op2=new Enteros();
        op2.setValor(2);
        Enteros res=op.sumar(op2);
        System.out.println("El valor es"+res.getValor());
        
    }
    
}
