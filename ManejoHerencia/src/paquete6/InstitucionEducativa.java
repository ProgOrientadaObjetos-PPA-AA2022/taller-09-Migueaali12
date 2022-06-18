
package paquete6;

public class InstitucionEducativa {
    
    private String nombreInsti;
    private String siglas;
    
    //constructor

    public InstitucionEducativa(String nombreInsti, String siglas) {
        this.nombreInsti = nombreInsti;
        this.siglas = siglas;
    }
          
    //establecer

    public void establecerNombreInsti(String nombreInsti) {
        this.nombreInsti = nombreInsti;
    }

    public void establecerSiglas(String siglas) {
        this.siglas = siglas;
    }
    
    //obtener

    public String obtenerNombreInsti() {
        return nombreInsti;
    }

    public String obtenerSiglas() {
        return siglas;
    }
    
    //toString
    
    @Override
    public String toString() {
        
        String cadena = String.format("Nombre de la institución: %s\n"
                + "Siglas: %s\n" ,nombreInsti, siglas);
         
        return cadena;
        
    }
    
}
