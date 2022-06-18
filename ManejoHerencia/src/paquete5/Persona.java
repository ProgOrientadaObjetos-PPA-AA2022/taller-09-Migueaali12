
package paquete5;

public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String username;
    
    //constructores

    public Persona(String nombre, String apellido, String username) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }
    
    //establecer
    
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerUsername(String username) {
        this.username = username;
    }
    
    //obtener

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"               
                + "Username: %s\n"
                ,nombre, apellido, username);
        
        return cadena;
        
    }
      
}
