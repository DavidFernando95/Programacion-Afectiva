/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoCola;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    private static fin int MAXTAMQ = 39;
    protected int frente;
    protected int fin;
    protected TipoDeDato [] listaCola;
    
    public ColaLineal(){
        frente=0;
        fin=-1;
        listaCola=new TipoDeDato [MAXTAMQ];
    }
    
    public void insertar(TipoDeDato elemento) throws Exception{
        if (!colaLlena()){
            listaCola[++fin]=elemento;
        }
        else
            throw new Exception("sobrecarga en la cola");
    }
    public TipoDeDato quitar() throws Exception{
        if (!colaVacia()){
            return listaCola[frente++];
        }else
            trow new Exception("cola vacia");
    }
    {
        return frente > fin;
    }
    public boolean colaLlena(){
        return fin == MAXTAMQ-1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
