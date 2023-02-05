package ejerciciosResueltosJavaJorge;
import java.util.*;

public class Basic1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Escribe el primer número");
		
		int numero1=input.nextInt();
		
		System.out.println("Escribe el número que quieres añadirle");
		
		int numero2=input.nextInt();
		
		int suma=(numero1+numero2);
		
		System.out.println("El resultado es " + suma);

	}

}