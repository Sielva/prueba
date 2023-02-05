package ejerciciosResueltosJavaJorge;
import java.util.*;
public class Basic1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Escribe el primer número para realizar las operaciones:");
		
		int num1=input.nextInt();
		
		System.out.println("Escribe el siguiente número:");
		
		int num2=input.nextInt();
		
		int res1=num1+num2;
		
		int res2=num1-num2;
		
		int res3=num1*num2;
		
		int res4=num1/num2;
		
		int res5=num1%num2;
		
		System.out.println(num1 + " + " + num2 + " = " + res1 + "\n" + num1 + " - " + num2 + " = " + res2 + "\n" + num1 + " * " + num2 + " = "
				+ res3 + "\n" + num1 + " / " + num2 + " = " + res4 + "\n" + num2 + " % de " + num1 + " = " + res5);

	}

}
