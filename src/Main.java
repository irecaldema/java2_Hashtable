import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;
public class Main {
    public static void main (String[] args) {
        
        Hashtable<String,Alumno> clase_502=new Hashtable<String,Alumno>();
        
        /*
        private String dni, Nombre, Apellidos, ciclo;
	    private int Edad;
        */
        
        Alumno alumno1 = new Alumno("08239927Q","Harry","P.",11,"is12");
        Alumno alumno2 = new Alumno("13560111R","Potter","H.",12,"is12");
        Alumno alumno3 = new Alumno("89962006J","Ironman","I.",13,"is12");
        
        clase_502.put("101",alumno1);
        clase_502.put("102",alumno2);
        clase_502.put("103",alumno3);

	    Enumeration<Alumno> enumeracion = clase_502.elements();
	    System.out.println("Alumnos:");
	    while (enumeracion.hasMoreElements()) {
	    	System.out.println("    " + enumeracion.nextElement().getNombre());
	    }
	    
	    Enumeration<String> llaves = clase_502.keys();
	    System.out.println("keys:");
	    while (llaves.hasMoreElements()) {
		    System.out.println("    "+"hashtable llaves: " + llaves.nextElement());
	    }
	    
    }
}