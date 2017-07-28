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
public class Enteros {
   private int valor;
   
   public Enteros(){
       this.valor=0;
   }
   public int getValor(){
       return valor;
   }
   public void setValor(int valor){
       this.valor=valor;
   }
   public Enteros sumar(Enteros op){
       Enteros res= new Enteros();
       res.setValor(this.getValor()+op.getValor());
       return res;
   }
           
}
