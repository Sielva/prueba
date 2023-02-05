package ejerciciosSueltos;
import java.util.*;
public class Ej6_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce un número para elevar al cuadrado");
		
		int num=in.nextInt();
		
		while (num!=0) {
			
			System.out.println(num + " al cuadrado es " + Math.pow(num, 2));
			
			System.out.println("Introduce otro número.");
			
			num=in.nextInt();
			
		}	System.out.println("Toda potencia de 0 es igual a 1.");

	}

}
