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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Nuevo {

    /**
     * @param args the command line arguments
     */
    public String ArchivoLeer(String Lectura) {
        String texto = "";
        FileReader archivo = null;
        String linea = "";
        try{
            archivo = new FileReader(Lectura);
            BufferedReader lector = new BufferedReader(archivo);
            while ((linea = lector.readLine()) != null) {
                texto += linea + "\n";
            }
        }
        catch (FileNotFoundException error) {
            throw new RuntimeException("Archivo no encontrado");
        }   
        catch (IOException error) {
            throw new RuntimeException("Ocurrio un error de entrada/salida");
        }   
        finally {
        if (archivo != null) {
            try {
                archivo.close();
            } 
            catch (IOException error) {
                error.printStackTrace();
            }
        }
        return texto;
        }
    }
    
    public void ArchivoGuardado(String Nuevo_Archivo, String texto) {
        FileWriter salida = null;
        try {
            salida = new FileWriter(Nuevo_Archivo);
            BufferedWriter escritor = new BufferedWriter(salida);
            escritor.write(texto);
        }    
        catch (IOException error) {
        error.printStackTrace();
        } 
        finally {
        if (salida != null) {
            try {
                salida.close();
            }
            catch (IOException error) {
            error.printStackTrace();
        }
      }
    }
  }
}



