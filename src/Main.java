import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;
public class Main {
    public static void main (String[] args) {
        
        
        Hashtable<String,String,String,String,Integer,String> clase_502=new Hashtable<String,String,String,String,Integer,String>();
        
        /*
        private String dni, Nombre, Apellidos, ciclo;
	    private int Edad;
        */
        
        clase_502.put("101","08239927Q","Harry","P.",11,"is12");
	    clase_502.put("102","13560111R","Potter","H.",12,"is12");
	    clase_502.put("103","89962006J","Ironman","I.",13,"is12");
	    clase_502.put("104","95311194E","Superman","S.",14,"is12");
	    clase_502.put("105","49202815L","Spiderman","S.S.",15,"is12");
	    
	    Enumeration<String> enumeracion = clase_502.elements();
	    System.out.println("Alumnos");
	    while (enumeracion.hasMoreElements()) {
	    	System.out.println("    " + enumeracion.nextElement());
	    }
        
    }
}