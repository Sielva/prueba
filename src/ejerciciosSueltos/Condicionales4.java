package ejerciciosSueltos;

import java.util.Scanner;

public class Condicionales4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce la base de la potencia.");
		
		int base=in.nextInt();
		
		System.out.println("Ahora introduce el exponente.");
		
		int exp=in.nextInt();
		
		if(exp>=1) {
			
			System.out.println(base + " elevado a " + exp + " = " + Math.pow(base, exp));
			
		}else if(exp==0) {
			
			System.out.println(base + " elevado a " + exp + " = " + "1");
			
		}else {
			
			System.out.println(base + " elevado a " + exp + " = " + Math.pow(base, exp));
			
		}//gilipollez como un piano

	}

}
