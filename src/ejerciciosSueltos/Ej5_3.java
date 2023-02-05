package ejerciciosSueltos;
import java.util.*;
public class Ej5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Escribe el primer número a comparar");
		
		double num1=in.nextDouble();
		
		System.out.println("Escribe el número que quieras comparar con el primero");
		
		double num2=in.nextDouble();
		
		if(num1<num2) {
			
			System.out.println(num1 + " es menor que " + num2);
			
		}else if(num1>num2) {
			
			System.out.println(num1 + " es mayor que " + num2);
			
		}else {
			
			System.out.println("Los números son idénticos");
			
		}

	}

}
