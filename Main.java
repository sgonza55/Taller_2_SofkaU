/**
 * Taller 2 Sofka U
 */
package com.mycompany.taller_2;

/**
 * Librerias para poder ingresar valores por consola. 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Codigo para creación de naves. 
 * @author Santiago Gonzalez - sgi1604@hotmail.com
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        /**
         * Variable para finalizar el ciclo do-while para creacion de naves. 
         */
        Integer otraNave = 0;
        /**
         * Creación del objeto NC (nave creada) para guardar naves creadas en una lista.
         */
        navesCreadas NC;
        NC = new navesCreadas(); 
        
        /**
         * Ciclo para crear naves mediante un do-while y un switch anidado. El do-while funciona como interuptor ya que al final de
         * la creación de cada nave, se le pregunta la usuario si desea crear otra o finalizar. El switch funciona como condicional
         * para crear el tipo de nave que el usario desea, ya que cada nave tiene diferentes caracteristicas. 
         */
        do {
            
            System.out.println("Ingrese 1 para Vehiculos Lanzados. " + "Ingrese 2 para Naves No Tripuladas. "
                + "Ingrese 3 para Naves Espaciales: ");
            /**
             * Variable para que el usuario ingrese el tipo de nave que desea crear.
             */
            Integer tipoDeNave = cargarNumeroInt();
            
            
            switch (tipoDeNave){
               
                case 1:
                    lanzadera Nave = new lanzadera();
                    System.out.println("Ingrese altura de la Nave en m");
                    Nave.setAltura(cargarNumeroFlo());
                    System.out.println("Ingrese capacidad de carga de la Nave en ton");
                    Nave.setCapacidadCarga(cargarNumeroFlo());
                    System.out.println("Ingrese 1 si la carga es un satelite superficial. Ingrese 2 si es una sonda. "
                            + "Ingrese 3 si es una Nave tripulada.");
                    Nave.setTipoCarga(cargarNumeroInt());
                    Nave.naveTerminada = "Se ha creado el vehiculo lanzadera " + Nave.Nombre()+ " fabricada por " + Nave.Lanzador() 
                        + " con un peso, altura y capacidad de carga de " + Nave.Peso() + "ton, " + Nave.getAltura() + "m, "
                        + Nave.getCapacidadCarga()+ "ton respectivamente, y propulsada con un combustible tipo " + Nave.Combustible()
                        + ". El tipo de carga es: " + Nave.getTipoCarga();
                    System.out.println (Nave.naveTerminada);
                    NC.setNaves(Nave.naveTerminada);
                    break;

                case 2:
                    nNoTripulada Nave1 = new nNoTripulada();
                    System.out.println("Ingrese velocidad maxima de la Nave en km/h");
                    Nave1.setVelocidadMaxima(cargarNumeroFlo());
                    System.out.println("Ingrese empuje de la Nave en ton");
                    Nave1.setEmpuje(cargarNumeroFlo());
                    Nave1.naveTerminada=("Se ha creado la Nave No tripulada " + Nave1.Nombre()+ " fabricada por " + Nave1.Lanzador() 
                        + " con un peso, empuje y velocidad maxima de " + Nave1.Peso() + "ton, " + Nave1.getEmpuje() + "ton, "
                        + Nave1.getVelocidadMaxima() + "km/h y esta propulsada con un combustible tipo " + Nave1.Combustible());
                    System.out.println (Nave1.naveTerminada);
                    NC.setNaves(Nave1.naveTerminada);
                    break;

                case 3:
                    nTripuladas Nave2 = new nTripuladas();
                    System.out.println("Ingrese distancia a la que orbita de la Tierra en km");
                    Nave2.setDistanciaOrbita(cargarNumeroFlo());
                    System.out.println("Ingrese 1 si la misión es lunar. Ingrese 2 si la misión es experimentación y estudio del "
                            + "comportamiento humano " + "Ingrese 3 si la misión es para mantenimiento y/o ensayos acoplamientos.");
                    Nave2.setTipoMision(cargarNumeroInt());
                    Nave2.naveTerminada=("Se ha creado la Nave tripulada " + Nave2.Nombre()+ " fabricada por " + Nave2.Lanzador() 
                        +  " con un peso y distancia de orbita con el planeta Tierra de " + Nave2.Peso() + "ton, " 
                        + Nave2.getDistanciaOrbita()  +  "km y esta propulsada con un combustible tipo " + Nave2.Combustible() 
                        + ". El tipo de misión es: " + Nave2.getTipoMision()); 
                    System.out.println (Nave2.naveTerminada);
                    NC.setNaves(Nave2.naveTerminada);
                    break;

                default:
                System.out.println("El número no esta dentro del rango, vuelva a iniciar");
            }
    
                System.out.println("¿Desea crear otra nave?. Ingrese 1 para nueva nave o 0 para terminar");
                Integer agregarNave = cargarNumeroInt();

                if (agregarNave==0){
                    otraNave = otraNave+1;
                    System.out.println("Ha finalizado el programa");
                }
        }
           while (otraNave<1);  
           System.out.println(NC.getNaves());
    }
   
     /**
     * Metodo que sirve para ingresar valores tipo Integer por consola.
     * @return Valor tipo Integer ingresado por consola.
     * @throws IOException 
     */
    private static Integer cargarNumeroInt() throws IOException{
        InputStreamReader CapturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(CapturarTeclado);
        String strnumero = buffer.readLine();
        Integer numero = Integer.parseInt(strnumero);
        return numero;
}
    /**
     * Metodo que sirve para ingresar valores tipo Float por consola.
     * @return Valor tipo Float ingresado por consola.
     * @throws IOException 
     */
    private static Float cargarNumeroFlo() throws IOException{
        InputStreamReader CapturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(CapturarTeclado);
        String strnumero = buffer.readLine();
        Float numero = Float.valueOf(strnumero);
        return numero;
    }
}


   