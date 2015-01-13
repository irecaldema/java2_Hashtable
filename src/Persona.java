public class Persona {
    
    //propiedades
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	// constructor, getter y setter
    public void setDni(String dni) {
        this.dni=dni;
    }
    public String getDni() {
        return dni;
    }  
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }  
    
    public void setApellidos(String apellidos) {
        this.apellidos=apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }  
    
    public void setEdad(String edad) {
        this.edad=edad;
    }
    public String getEdad() {
        return edad;
    }  
}