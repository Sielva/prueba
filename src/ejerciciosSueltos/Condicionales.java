package ejerciciosSueltos;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Escribe el primero número.");
		
		double num1=in.nextDouble();
		
		System.out.println("Escribe el segundo número.");
		
		double num2=in.nextDouble();
		
		if(num1<num2) {
			
			System.out.println(num2 + " es mayor que " + num1 + ".");
			
		}else if(num1>num2){
			
			System.out.println(num1 + " es mayor que " + num2 + ".");
			
		}else {
			
			System.out.println("Los números son iguales.");
			
		}

	}

}
