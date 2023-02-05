package ejerciciosSueltos;
import java.util.*;
public class ComprobarSiPositivoNegativo {
	
	public static void main(String[] args) {
	
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("Escribe el número que quieras comprobar");
	
	double num=entrada.nextDouble();
	
	if (num>0){
		
		System.out.println("El numero " + num + " es positivo.");
		
	} else if (num<0) {
		
		System.out.println("El número " + num + " es negativo.");
		
	} else {
		
		System.out.println("El número es 0.");
		
	}
	
	}
}
