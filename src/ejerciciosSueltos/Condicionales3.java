package ejerciciosSueltos;

import java.util.Scanner;

public class Condicionales3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		String cadena;
		
		System.out.println("Este prograna identificará si el usuario ha introducido una frase o una sola letra mayúscula."
				+ "\nIntroduce la cadena que desees:");
		
		cadena=in.nextLine();
		
		if(cadena.length()!=1) {
			
			System.out.println("La cadena no es una letra mayúscula.");
			
		}else if((cadena.compareTo("A")>=0) && (cadena.compareTo("Z")<=0)){
			
			System.out.println("La cadena es una letra mayúscula.");
			
		}else {
			
			System.out.println("La cadena no es una letra mayúscula.");
			
		}

	}

}
