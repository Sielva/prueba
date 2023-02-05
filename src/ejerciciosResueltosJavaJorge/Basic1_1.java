package ejerciciosResueltosJavaJorge;
import java.util.*;
public class Basic1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("¿Cómo te llamas?");
		
		String nombre=input.next();
		
		System.out.println("¿Y tu apellido?");
		
		String apellido=input.next();
		
		System.out.println();
		
		System.out.println("Hola \n" + nombre + " " + apellido);

	}

}
