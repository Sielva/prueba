package ejerciciosSueltos;

import java.util.Scanner;

public class Condicionales5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce tu género (H/M).");
		
		String genero=in.nextLine();
		
		System.out.println("Introduce tu nota media.");
		
		int nota=in.nextInt();
		
		System.out.println("Por último, introduce tu edad.");
		
		int edad=in.nextInt();
		
		if((!genero.equalsIgnoreCase("H"))&&(!genero.equalsIgnoreCase("M"))) {
			
			System.out.println("Error en la solicitud. Género.");
			
		}else if((genero.equalsIgnoreCase("M"))&&(edad>=18)&&(nota>=5)&&(nota<=10)){
			
			System.out.println("POSIBLE");
			
		}else if((genero.equalsIgnoreCase("H"))&&(edad>=18)&&(nota>=5)&&(nota<=10)) {
			
			System.out.println("ACEPTADO");
			
		}if((nota>10)||(nota<5)){
			
			System.out.println("Error en la solicitud. Nota.");
			
		}if(edad<18) {
			
			System.out.println("Error en la solicitud. Edad.");
			
		}

	}

}
