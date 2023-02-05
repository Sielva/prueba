package ejerciciosResueltosJavaJorge;
import java.util.*;
public class Basic2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Escribe el primero de los números sobre los que quieras calcular la media:");
		
		double num1=input.nextDouble();
		
		System.out.println("Escribe el segundo número:");
		
		double num2=input.nextDouble();
		
		System.out.println("Por último, escribe el tercer número:");
		
		double num3=input.nextDouble();
		
		double media=((num1+num2+num3)/3);
		
		double mediaF=Math.round(media*1000);
		
		System.out.println("La media aritmética de " + num1 + ", " + num2 + ", " + num3 + " = " + mediaF/1000);

	}

}
