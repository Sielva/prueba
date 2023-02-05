package ejerciciosResueltosJavaJorge;
import java.util.*;
public class Basic1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Introduce el dividendo");
		
		int num1=input.nextInt();
		
		System.out.println("Introduce el divisor");
		
		int num2=input.nextInt();
		
		System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " es " + (num1/num2));

	}

}
