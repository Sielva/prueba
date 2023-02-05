package poo;

import javax.swing.*;

public class Uso_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Seat=new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE COCHE.
		
		System.out.println(Seat.dime_datos_generales());
		
		Seat.establece_color(JOptionPane.showInputDialog("Introduce el color que quieres en tu vehículo."));
				
		System.out.println(Seat.dime_color());
		
		Seat.establece_asientos(JOptionPane.showInputDialog("¿Equipará el vehículo asientos de cuero? (si/no)"));
		
		System.out.println(Seat.dime_asientos());
		
		Seat.configura_climatizador(JOptionPane.showInputDialog("¿Equipará el vehículo climatizador? (si/no)"));
		
		System.out.println(Seat.dime_climatizador());
		
		System.out.println(Seat.dime_peso_coche() + ".");
		
		System.out.println("El precio final del vehículo es " + Seat.precio_coche() + " euros.");
		
	}

}
