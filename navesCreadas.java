/*
 * Taller 2 Sofka U
 */
package com.mycompany.taller_2;

/**
 * Libreria para crear una lista. 
 */
import java.util.ArrayList;

/**
 * Clase para guardar cada una de las clases creadas por el usuario.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class navesCreadas {
    
    /**
     * Lista para guardar las naves creadas. 
     */
    public ArrayList<String> naves = new ArrayList<>();
    
    /**
     * Metodo que regresa la nave creada a guardar en la lista. 
     * @return Lista de naves creadas. 
     */
    public ArrayList<String> getNaves() {
        return naves;
    }
    
    /**
     * Metodo para establecer la nave creada a guardar en la lista. 
     * @param naves Nave creada agregada a la lista. 
     */
    public void setNaves(String naves) {
        this.naves.add(naves);
    }
}
