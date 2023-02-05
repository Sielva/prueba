package poo;
import java.util.*;
import javax.swing.*;
public class Uso_Movil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		Movil MiA1=new Movil();
		
		System.out.println("Comencemos la personalización del teléfono móvil por la memoria RAM. ¿Quieres 8 gb o 16 gb de RAM?");
		
		MiA1.establece_ram(in.nextInt());
		
		System.out.println("Sigamos con la capacidad de almacenamiento. ¿Deseas 300 gb o 750 gb de memoria de almacenamiento?");
		
		MiA1.establece_memoria(in.nextInt());
		
		System.out.println("Muy bien. ¿Deseas que se instale un protector de pantalla? (si/no)");
		
		MiA1.establece_protector(in.next());
		
		System.out.println("Por último, ¿deseas que se te envíe una funda de protección para el teléfono? (si/no)");
		
		MiA1.establece_funda(in.next());
		
		System.out.println(MiA1.dime_datos_finales());
		

	}

}
