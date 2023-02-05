import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do{
			
			genero=JOptionPane.showInputDialog("Introduce tu género (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centímetros"));
		
		int pesid=0;
		
		if (genero.equalsIgnoreCase("H")){
			
			pesid=altura-110;
		}
		
		else if(genero.equalsIgnoreCase("M")){
			
			pesid=altura-120;
		}
		
		System.out.println("Tu peso ideal es " + pesid + " kg.");
    }
}