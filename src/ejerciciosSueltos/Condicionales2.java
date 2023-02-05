package ejerciciosSueltos;

import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Escribe el dividendo.");
		
		double dividendo=in.nextDouble();
		
		System.out.println("Escribe el divisor.");
		
		double divisor=in.nextDouble();
		
		double res=dividendo/divisor;
		
		if(divisor==0) {
			
			System.out.println("Error.");
			
		}else {
			
			System.out.println(dividendo + " dividido entre " + divisor + " = " + res);
			
		}

	}

}
