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
 * Clase extendida de la clase abstracta Nave a la que se le implementa la interface ItipoCarga para crear Vehiculos Lanzadera.
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class lanzadera extends Nave implements ItipoCarga{

    /**
     * Capacidad de carga de la nave.
     */
    private Float capacidadCarga;
    /**
     * Altura de la nave.
     */
    private Float altura;
    /**
     * Tipo de carga que lleva la nave.
     */
    private String carga;
    
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
     * @return 
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
     * Regresa la capacidad de carga de la nave. 
     * @return La capacidad de carga. 
     */
    public Float getCapacidadCarga() {
        return capacidadCarga;
    }
    /**
     * Establece la capacidad de carga de la nave. 
     * @param capacidadCarga Capacidad de carga de la nave. 
     */
    public void setCapacidadCarga(Float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Regresa la altura de la nave. 
     * @return Altura de la nave. 
     */
    public Float getAltura() {
        return altura;
    }
    /**
     * Regresa la altura de la nave.
     * @param altura La altura de la nave. 
     */
    public void setAltura(Float altura) {
        this.altura = altura;
    }
    
    /**
     * Metodo implementado de la interface ItipoCarga que establece el tipo de carga de la nave. 
     * Puede ser Satelite superficial, una sonda, Nave tripulada o no especifica. 
     * @param tipoCarga 1 si es Satelite, 2 Sonda y 3 para Nave tripulada. Para otros valores se establece que no se especifica. 
     */
    @Override
    public void setTipoCarga(Integer tipoCarga) {
        if (1==tipoCarga){
            carga = "Satelite superficial";
        } else if (2==tipoCarga){
            carga = "Sonda";
        } else if (3==tipoCarga){
            carga = "Nave tripulada";
        } else {
            carga = "No especifica";
        }
    }
    /**
     * Regresa el tipo de carga 
     * @return El tipo de carga. 1 si es Satelite, 2 Sonda y 3 para Nave tripulada
     */
    @Override
    public String getTipoCarga() {
        return carga;
    }
    
    /**
     * Metodo que sirve ingresar valores tipo Float por consola. 
     * @return Valor tipo float ingresado por consola.
     * @throws IOException 
     */
    private static Float cargarNumeroFlo() throws IOException  {
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
    private static String cargarTexto() throws IOException {
        InputStreamReader CapturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(CapturarTeclado);
        String strtexto = buffer.readLine();
        return strtexto;
    }

}
