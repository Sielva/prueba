package ejerciciosResueltosJavaJorge;
import java.util.*;
public class Basic1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Escribe el primer factor de la multiplicación:");
		
		int num1=input.nextInt();
		
		System.out.println("Escribe el segundo factor de la multiplicación:");
		
		int num2=input.nextInt();
		
		int res=num1*num2;
		
		System.out.println("El producto de multiplicar " + num1 + " por " + num2 + " es igual a " + res);

	}

}
