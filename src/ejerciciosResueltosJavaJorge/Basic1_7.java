package ejerciciosResueltosJavaJorge;
import java.util.*;
public class Basic1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Introduce el número que quieres multiplicar:");
		
		int num=input.nextInt();
		
		for (int i=1; i<=10; i++){
			
			System.out.println(num + " * " + i + " = " + (num*i));
		}

	}

}
