/**
 * Taller 2 Sofka U
 */ 
package com.mycompany.taller_2;

/**
 * Interface para establecer metodo para tipo de mision de la nave.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public interface ItipoMision {
    /**
     * Metodo que establece el tipo de mision de la nave. 
     * @param tipoMision Tipo de mision de la nave. 
     */
    public void setTipoMision (Integer tipoMision);
    /**
     * Metodo que devuelve el tipo de mision de la nave. 
     * @return Mision de la nave. 
     */
    public String getTipoMision();
}
