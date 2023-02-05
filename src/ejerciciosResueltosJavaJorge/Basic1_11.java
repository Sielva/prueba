package ejerciciosResueltosJavaJorge;
import java.util.*;
public class Basic1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Introduce el radio del círculo a calcular.");
		
		double radio=input.nextDouble();
		
		double area=(Math.PI)*(Math.pow(radio, 2));
		
		double perimetro=(Math.PI)*(radio)*(2);
		
		System.out.println("El area de un círculo con radio de " + radio + " es " + area);
		System.out.println("El perímetro de un círculo con radio de " + radio + " es " + perimetro);

	}

}
