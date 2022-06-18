
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

public class PrestamoEducativo extends Prestamo{
    
    private String nivelDeEsudio;
    private InstitucionEducativa centroEducativo;
    private double valorDeLaCarrera;
    private double valorMensualCarrera;
    
    //constructor

    public PrestamoEducativo(String nivelDeEsudio, 
            InstitucionEducativa centroEducativo, double valorDeLaCarrera 
            ,Persona beneficiario, int tiempoPrestamo, String ciudad) {
        
        super(beneficiario, tiempoPrestamo);
        establecerCiudad(ciudad);
        this.nivelDeEsudio = nivelDeEsudio;
        this.centroEducativo = centroEducativo;
        this.valorDeLaCarrera = valorDeLaCarrera;
        establecerValorMensualCarrera();
        this.valorMensualCarrera = obtenerValorMensualCarrera();
    }
      
    //establecer

    public void establecerNivelDeEsudio(String nivelDeEsudio) {
        this.nivelDeEsudio = nivelDeEsudio;
    }

    public void establecerCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public void establecerValorDeLaCarrera(double valorDeLaCarrera) {
        this.valorDeLaCarrera = valorDeLaCarrera;
    }
    
    @Override
    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad.toUpperCase();
    }

    public void establecerValorMensualCarrera() {
        
        double valorMensual, porcentaje;
        
        valorMensual = valorDeLaCarrera / tiempoPrestamoMeses;
        
        porcentaje = (valorMensual * 10) / 100;
        
        valorMensualCarrera = valorMensual - porcentaje;
                  
    }
    
    //obtener

    public String obtenerNivelDeEsudio() {
        return nivelDeEsudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorDeLaCarrera() {
        return valorDeLaCarrera;
    }

    public double obtenerValorMensualCarrera() {
        return valorMensualCarrera;
    }
    
    //toString
    
    @Override
    public String toString() {
        
        String cadena = String.format("PRESTAMO EDUCATIVO\n"
                + "--Datos del beneficiario --\n"
                + " %s"
                + " Nivel de estudio: %s\n"
                + "-- Institucion Educativa --\n"
                + " %s"
                + "-- Valores del prestamo --\n"
                + " Valor de la carrera: %.2f\n"
                + " Valor mensual a pagar de la carrera: %.2f\n"
                ,super.toString(), nivelDeEsudio, centroEducativo.toString()
                ,valorDeLaCarrera, valorMensualCarrera);
         
        return cadena;
        
    }
    
}
