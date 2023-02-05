package ejerciciosSueltos;

import java.util.Scanner;

public class Ej5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce el primero número.");
		
		int num1=in.nextInt();
		
		System.out.println("Introduce el segundo número.");
		
		int num2=in.nextInt();
		
		if((num1>0)||(num2>0)) {
			
			System.out.println("Se cumple la condición.");
			
		} else {
			
			System.out.println("No se cumple la condición.");
			
		}

	}

}
