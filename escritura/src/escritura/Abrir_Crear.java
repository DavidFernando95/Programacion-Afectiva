/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura;

/**
 *
 * @author Usuario
 */
public class Abrir_Crear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nuevo archivo = new Nuevo();
        String entrada = archivo.ArchivoLeer("Prueba.txt");
        System.out.println(entrada);
    archivo.ArchivoGuardado("PruebaCopia.txt", entrada);
    }
    
}
