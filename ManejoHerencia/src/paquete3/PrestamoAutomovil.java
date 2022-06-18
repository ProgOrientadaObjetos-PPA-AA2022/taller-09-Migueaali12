
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

public class PrestamoAutomovil extends Prestamo {
    
    private String tipo;
    private String marca;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensual;
    
    //constructores

    public PrestamoAutomovil(String tipo, String marca, Persona garante1, 
            double valorAutomovil, Persona beneficiario, 
            int tiempoPrestamo, String ciudad) {
        
        super(beneficiario, tiempoPrestamo);
        establecerCiudad(ciudad);
        this.tipo = tipo;
        this.marca = marca;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        establecerValorMensual();
        this.valorMensual = obtenerValorMensual();
    }
      
    //establecer

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public void establecerGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public void establecerValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }
    
    @Override
    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad.toLowerCase();
    }

    public void establecerValorMensual() {
        this.valorMensual = valorAutomovil / tiempoPrestamoMeses;
    }
    
    //obtener

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }
    
    //toString
    
    @Override
    public String toString() {
        
        String cadena = String.format("PRESTAMO AUTOMÓVIL\n"
                + "-- Datos del beneficiario --\n"
                + " %s"
                + "-- Detalles del Auto --\n"
                + " Tipo de auto: %s\n"
                + " Marca del auto; %s\n"
                + "-- Datos del garante --\n"
                + " %s"
                + "-- Valores del Prestamo --\n"
                + " Valor del automovil: %.2f\n"
                + " Valor mensual a pagar: %.2f\n"
                ,super.toString(), tipo, marca, garante1.toString(), 
                valorAutomovil, valorMensual);
         
        return cadena;
        
    }
    
}
