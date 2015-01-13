public class Alumno extends Persona {

    //propiedades
	private String ciclo;

	// constructor, getter y setter

	public Alumno (String dni,String nombre,String apellidos,int edad,String ciclo) {
	    setDni(dni);
	    setNombre(nombre);
	    setApellidos(apellidos);
	    setEdad(edad);
	    this.ciclo=ciclo;
	}
	
    public void setCiclo(String ciclo) {
        this.ciclo=ciclo;
    }
    public String getCliclo() {
        return ciclo;
    }  
}