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
 * Clase extendida de la clase abstracta Nave a la que se le implementa la interface ItipoMision para crear Naves Tripuladas. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class nTripuladas extends Nave implements ItipoMision {

    /**
     * Distancia a la que orbita la Nave de la Tierra. 
     */
    private Float distanciaOrbita;
    /**
     * Tipo de misión de la Nave. 
     */
    private String mision;
    
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
     * Metodo implementado dela interface ItipoMision para establecer el tipo de mision de la nave. 
     * @param tipoMision Puede ser 1 para Mision Lunar , 2 para Experimentación y estudio del comportamiento humano
     * y 3 para Mantenimientos y/o acoplamientos.
     */
    @Override
    public void setTipoMision(Integer tipoMision) {
        if (1==tipoMision){
            mision = "Misión lunar";
        } else if (2==tipoMision){
            mision = "Experimentación y estudio del comportamiento humano";
        } else if (3==tipoMision){
            mision = "Mantenimiento y/o ensayos acoplamientos";
        } else {
            mision = "No se establece";
        }
    }
    
    /**
     * Metodo que devuelve el tipo de misión de la nave. 
     * @return Tipo de misión de la nave. 
     */
    @Override
    public String getTipoMision() {
        return mision;
    }
    
    /**
     * Metodo que devuelve la distancia de orbita de la nave a la Tierra. 
     * @return Distancia de orbita de la nave con la Tierra. 
     */
    public Float getDistanciaOrbita() {
        return distanciaOrbita;
    }
    /**
     * Metodo que establece la distancia de orbita de la nave a la Tierra. 
     * @param distanciaOrbita Orbita de la nave con la Tierra. 
     */
    public void setDistanciaOrbita(Float distanciaOrbita) {
        this.distanciaOrbita = distanciaOrbita;
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