package ejerciciosSueltos;
import java.util.*;
public class Ej6_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce tu número de usuario.");
		
		int user=in.nextInt();
		
		System.out.println("Introduce tu contraseña.");
		
		int pass=in.nextInt();

		while (user!=1809 || pass!=1234) {
		
		System.out.println("Usuario y/o contraseña incorrectos. Vuelve a introducir tu usuario.");
		
		user=in.nextInt();
		
		System.out.println("Introduce tu contraseña.");
		
		pass=in.nextInt();
		
	}	System.out.println("Correcto.");
	
  }

}	