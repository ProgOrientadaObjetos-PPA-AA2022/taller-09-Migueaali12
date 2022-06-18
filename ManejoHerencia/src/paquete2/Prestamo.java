package paquete2;

import paquete5.Persona;

public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamoMeses;
    protected String ciudad;
    
    //constructores

    public Prestamo(Persona beneficiario, int tiempoPrestamo, String ciudad) {
        
        this.beneficiario = beneficiario;
        this.tiempoPrestamoMeses = tiempoPrestamo;
        this.ciudad = ciudad;
    }
    
    public Prestamo(Persona beneficiario, int tiempoPrestamo) {
        
        this.beneficiario = beneficiario;
        this.tiempoPrestamoMeses = tiempoPrestamo;
    }

    //establecer

    public void establecerBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void establecerTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamoMeses = tiempoPrestamo;
    }

    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //obtener

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamoMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    
    //ToString

    @Override
    public String toString() {               
        
        String cadena = String.format("Nombre beneficiario: %s\n"
                + "Apellido beneficiario: %s\n"
                + "Username beneficiario: %s\n"
                + "Tiempo del prestamo en meses: %d\n"
                + "Ciudad: %s\n", beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(), beneficiario.obtenerUsername(),
                tiempoPrestamoMeses, ciudad);
        
        return cadena;
    }
    
    
    
}
