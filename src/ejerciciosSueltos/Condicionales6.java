package ejerciciosSueltos;

import java.util.Scanner;

public class Condicionales6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Este es un programa de clasificación de triángulos en función de sus dimensiones.\nIntroduce el valor "
				+ "del primer lado.");
		
		double lado1=in.nextDouble();
		
		System.out.println("A continuación, introduce el valor del segundo lado.");
		
		double lado2=in.nextDouble();
		
		System.out.println("Por último, introduce el valor del último lado.");
		
		double lado3=in.nextDouble();
		
		boolean rect=false;
			
		if(Math.pow(lado1, 2)==(Math.pow(lado2, 2)+(Math.pow(lado3, 2)))) {
				
				rect=true;
				
			}else if(Math.pow(lado2, 2)==(Math.pow(lado1, 2)+(Math.pow(lado3, 2)))) {
				
				rect=true;
			
		   }else if(Math.pow(lado3, 2)==(Math.pow(lado1, 2)+(Math.pow(lado2, 2)))) {
				
				rect=true;
				
		if(rect=true) {
				
				System.out.println("Es un triángulo rectángulo.");
				
			}
			
		}if((lado1==lado2)&&(lado1==lado3)) {
			
			System.out.println("Es un triángulo equilátero.");
			
		}if((lado1==lado2)&&(lado1!=lado3)) {
			
			System.out.println("Es un triámgulo isósceles.");
			
		}else if((lado1==lado3)&&(lado1!=lado2)) {
			
			System.out.println("Es un triángulo isósceles.");
			
		}else if((lado2==lado3)&&(lado2!=lado1)) {
			
			System.out.println("Es un triángulo isósceles.");
			
		}if((lado1!=lado2)&&(lado1!=lado3)&&(lado2!=lado3)) {
			
			System.out.println("Es un triángulo escaleno.");
			
		}

	}

}
