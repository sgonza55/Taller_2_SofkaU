/*
 * Taller 2 Sofka U.
 */
package com.mycompany.taller_2;


/**
 * Interface para establecer el valor del empuje de la nave. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public interface IEmpuje {
    /**
     * Metodo para establecer el valor del empuje. 
     * @param empuje valor del emouje en ton.
     */
    public void setEmpuje (Float empuje);
    /**
     * Metodo que devuelve el valor del empuje
     * @return Empuje de la nave.
     */
    public Float getEmpuje();
}
