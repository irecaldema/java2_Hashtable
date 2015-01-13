import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;
public class Main {
    public static void main (String[] args) {
        
        
        //Hashtable<String,String,String,String,Integer,String> clase_502=new Hashtable<String,String,String,String,Integer,String>();
        //Alumno alumno = new Alumno;
        //Hashtable<String,Alumno> clase_502=new Hashtable<String,Alumno>();
        Hashtable<String,Persona> clase_502=new Hashtable<String,Persona>();
        /*
        private String dni, Nombre, Apellidos, ciclo;
	    private int Edad;
        */
        //Alumno alumno = new Alumno("08239927Q","Harry","P.",11,"is12");
        //Persona persona = new Persona("08239927Q","Harry","P.",11);
        //clase_502.put("101",persona);
        //Persona persona = new Persona("08239927Q","Harry","P.",11);
        //clase_502.put("102",persona);
        //Persona persona = new Persona("08239927Q","Harry","P.",11);
        //clase_502.put("102",persona);
        
        Persona persona = new Persona();
        persona.setPersona("08239927Q","Harry","P.",11);
        clase_502.put("101",persona);
        persona.setPersona("13560111R","Potter","H.",12);
        clase_502.put("102",persona);
        persona.setPersona("89962006J","Ironman","I.",13);
        clase_502.put("103",persona);

        /*
        clase_502.put("101","08239927Q","Harry","P.",11,"is12");
	    clase_502.put("102","13560111R","Potter","H.",12,"is12");
	    clase_502.put("103","89962006J","Ironman","I.",13,"is12");
	    clase_502.put("104","95311194E","Superman","S.",14,"is12");
	    clase_502.put("105","49202815L","Spiderman","S.S.",15,"is12");
	    */
	    Enumeration<Persona> enumeracion = clase_502.elements();
	    System.out.println("Alumnos:");
	    while (enumeracion.hasMoreElements()) {
	    	System.out.println("    " + enumeracion.nextElement().getNombre());
	    }
        
    }
}