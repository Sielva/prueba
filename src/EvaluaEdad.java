import java.util.*;
public class EvaluaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor.");
		
		int edad=entrada.nextInt();
		
		if(edad<18){
			
			System.out.println("Eres menor de edad");
		}
		
		else if (edad<40) {
			
			System.out.println("Eres una persona joven");
		}
		
		else if (edad<65) {
			
			System.out.println("Eres una persona madura");
		}
		
		else {
			
			System.out.println("Ya tienes una edad. cuídate.");
		}
		
		/*if(edad>18){
			
			System.out.println("Eres mayor de edad.");
		}
		else{
			
			System.out.println("Eres menor de edad.");
			
		}*/

	}

}
