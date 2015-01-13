public class Persona {
    
    //propiedades
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	// constructor, getter y setter
	public Persona(){};
	
	public Persona (String dni,String nombre,String apellidos,int edad) {
	    this.dni=dni;
	    this.nombre=nombre;
	    this.apellidos=apellidos;
	    this.edad=edad;
	}
	
	public void setPersona (String dni,String nombre,String apellidos,int edad) {
	    this.dni=dni;
	    this.nombre=nombre;
	    this.apellidos=apellidos;
	    this.edad=edad;
	}
	
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
    
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public int getEdad() {
        return edad;
    }  
}