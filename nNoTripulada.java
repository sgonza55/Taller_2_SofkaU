/*
 * Taller 2 Sofka U. 
 */
package com.mycompany.taller_2;

/**
 * Librerias para poder ingresar valores por consola. 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase extendida de la clase abstracta Nave a la que se le implementa la interface IEmpuje para crear Naves No Tripuladas. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class nNoTripulada extends Nave implements IEmpuje {

    /**
     * Empuje de la Nave en ton. 
     */
    private Float empuje;
    /**
     * Velocidad Maxima a la que va la nave. 
     */
    private Float velocidadMaxima;
    
    /**
     * Metodo que establece el nombre de la nave. 
     * @return Nombre de la nave. 
     */
    @Override
    public String Nombre() {
        System.out.println("Ingrese nombre de la Nave");
        nombre = cargarTexto();
        return (nombre);
    }
    
    /**
     * Metodo que establece quien diseña la nave. 
     * @return País que diseña y lanza la nave. 
     */
    @Override
    public String Lanzador() {
        System.out.println("Ingrese quien fue el lanzador de la nave");
        lanzador = cargarTexto();
        return (lanzador);
    }
    
     /**
     * Metodo que establece el peso de la nave. 
     * @return peso de la nave. 
     */
    @Override
    public Float Peso() {
        System.out.println("Ingrese peso de la Nave en ton");
        peso = cargarNumeroFlo();
        return (peso);
    }
    
    /**
     * Metodo que establece el tipo de combustible de la nave. 
     * @return Tipo de combistible que propulsiona la nave. 
     */
    @Override
    public String Combustible() {
        System.out.println("Ingrese combustible de la Nave");
        combustible = cargarTexto();
        return (combustible);
    }

    /**
     * Metodo que establece el empuje de la nave
     * @param empuje Empuje de la nave. 
     */
    @Override
    public void setEmpuje(Float empuje) {
        this.empuje = empuje; 
    }
    /**
     * Metodo que devuelve el valor del empuje de la nave. 
     * @return Empuje de la nave.
     */
    @Override
    public Float getEmpuje() {
        return empuje;
    }
    /**
     * Metodo que devuelve el la velocidad maxima de la nave.   
     * @return Velocidad maxima de la nave. 
     */
    public Float getVelocidadMaxima()  {
        return velocidadMaxima;
    }
    /**
     * Metodo que establece la velocidad maxima de la nave. 
     * @param velocidadMaxima Valor de la velocidad maxima. 
     */
    public void setVelocidadMaxima(Float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Metodo que sirve ingresar valores tipo Float por consola. 
     * @return Valor tipo float ingresado por consola.
     * @throws IOException 
     */
    private static Float cargarNumeroFlo() throws IOException{
        InputStreamReader CapturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(CapturarTeclado);
        String strnumero = buffer.readLine();
        Float numero = Float.valueOf(strnumero);
        return numero;
    }
    /**
     * Metodo que sirve para ingresar valores tipo String por consola.
     * @return Valor tipo String ingresado por consola.
     * @throws IOException 
     */
    private static String cargarTexto() throws IOException{
        InputStreamReader CapturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(CapturarTeclado);
        String strtexto = buffer.readLine();
        return strtexto;
    }
}
