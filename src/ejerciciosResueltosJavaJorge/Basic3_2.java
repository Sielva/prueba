package ejerciciosResueltosJavaJorge;
import java.util.*;
public class Basic3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce el primer número.");
		
		int num1=in.nextInt();
		
		System.out.println("Introduce el segundo número.");
		
		int num2=in.nextInt();
		
		if (num1!=num2) {
			
			System.out.println(num1 + " es diferente de " + num2);
			
		}
		
		if (num1>num2) {
			
			System.out.println(num1 + " es mayor que " + num2);
			
		}else if(num1<num2) {
			
			System.out.println(num1 + " es menor que " + num2);
			
		}else {
			
			System.out.println(num1 + " y " + num2 + " son iguales.");
			
		}

	}

}
