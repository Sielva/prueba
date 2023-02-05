package ejerciciosSueltos;
import java.util.*;
public class CompruebaMultiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Escribe el número que quieras comprobar si es múltiplo de 3.");
		
		int num1=in.nextInt(); int num2=3;
		
		int res=num1%num2;
		
		if(res==0){
			
			System.out.println(num1 + " es múltiplo de 3.");
			
		}else {
			
			System.out.println(num1 + " no es múltiplo de 3.");
			
		}
		
	}

}
