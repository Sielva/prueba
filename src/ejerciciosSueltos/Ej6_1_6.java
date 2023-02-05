package ejerciciosSueltos;

import java.util.Scanner;

public class Ej6_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce tu número de usuario.");
		
		int user=in.nextInt();
		
		System.out.println("Introduce tu contraseña.");
		
		int pass=in.nextInt();
		
		int fallos=0;
		
		if (user==1809 && pass==1234) {
			
			System.out.println("Login correcto.");
			
		}

		while (user!=1809 || pass!=1234) {
			
		fallos++;
		
		System.out.println("Usuario y/o contraseña incorrectos. Vuelve a introducir tu usuario.");
		
		user=in.nextInt();
		
		System.out.println("Introduce tu contraseña.");
		
		pass=in.nextInt();
		
		if(user==1809 && pass==1234) {
			
			System.out.println("Login correcto.");
			
			break;
			
		}
		
		if (fallos==2) {
			
			System.out.println("Número máximo de intentos alcanzado. Inicio de sesión bloqueado.");
			
			break;
			
		}
		
	  }
		
	}
	
  }