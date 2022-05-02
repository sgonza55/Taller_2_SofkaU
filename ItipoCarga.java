/*
 * Taller 2 Sofka U. 
 */
package com.mycompany.taller_2;

/**
 * Interface que establece los metodos para asignar el tipo de carga que lleva la nave. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public interface ItipoCarga {
    /**
     * Metodo que establece el tipo de carga que lleva la nave.
     * @param tipoCarga Tipo de carga de la nave. 
     */
    public void setTipoCarga (Integer tipoCarga);
    /**
     * Metodo que devuelve el tipo de carga que lleva la nave. 
     * @return Tipo de carga que lleva la nave. 
     */
    public String getTipoCarga();
}
