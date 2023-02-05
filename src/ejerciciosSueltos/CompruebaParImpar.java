package ejerciciosSueltos;
import java.util.*;
public class CompruebaParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Introduce el número a comprobar");
		
		int num=in.nextInt();
		
		int res=num%2;
		
		if (res==0){

			System.out.println(num + " es un número par");
			
	} else {
		
		System.out.println(num + " es un número impar");
	 }

   }
}