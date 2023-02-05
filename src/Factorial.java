import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long res=1L;
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número a factorizar."));
		
		for(int i=num;i>0;i--) {
			
			res=res*i;
		}
		
		System.out.println("El factorial de " + num + " es " + res);

	}

}
