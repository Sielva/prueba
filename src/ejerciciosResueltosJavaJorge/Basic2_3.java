package ejerciciosResueltosJavaJorge;

import java.util.*;

public class Basic2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Introduce la base del rectángulo");
		
		double largo=input.nextDouble();
		
		System.out.println("Introduce la altura del rectángulo");
		
		double alto=input.nextDouble();
		
		double area=(alto*largo);
		
		double areaF=Math.round(area*1000);
		
		double perimetro=2*(alto+largo);
		
		double perimetroF=Math.round(perimetro*1000);
		
		System.out.println("El área de un rectángulo con base " + largo + " y altura " + alto + " es " + areaF/1000 + "\nY el perimetro es "
				 + perimetroF/1000);

	}

}
