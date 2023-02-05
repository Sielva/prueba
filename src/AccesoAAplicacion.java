import javax.swing.*;
public class AccesoAAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="casepuma";
		
		String pas="";
		
		while (clave.equals(pas)==false){
			
			pas=JOptionPane.showInputDialog("Introduce tu contraseña");
			
			if (clave.equals(pas)==false) {
				
				System.out.println("La contraseña indicada no es correcta");
				
			}
		}
		
		System.out.println("Contraseña correcta");

	}

}
