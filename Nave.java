/*
 *Taller 2 Sofka U.
 */
package com.mycompany.taller_2;


/**
 * Representa una clase abstracta de una nave.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public abstract class Nave {
    
    /**
     * Nombre de la nave
     */
    public String nombre;
    /**
     * País que lanzará la nave. Quien la fabricara. 
     */
    public String lanzador;
    /**
     * Peso de la nave.
     */
    public Float peso;
    /**
     * Tipo de combustible de la nave.
     */
    public String combustible;
    /**
     * Nave terminada con todas sus caracteristicas. 
     */
    public String naveTerminada; 
    
    /**
     * Metodo para asignar nombre a la nave. 
     * @return El nombre de la nave. 
     */
    public abstract String Nombre();
    /**
     * Metodo para asignar quien diseña la nave. 
     * @return País que lanzó la nave. 
     */
    public abstract String Lanzador();
    /**
     * Metodo para asignar el peso de la nave.
     * @return Peso de la nave.
     */
    public abstract Float Peso();
    /**
     * Metodo para asignar el tipo de combustible de la nave.
     * @return Tipo de combustible de la nave.
     */
    public abstract String Combustible();
    
}
