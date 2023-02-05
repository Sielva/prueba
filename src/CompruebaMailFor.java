import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.JOptionPane;

public class CompruebaMailFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba=0;
		
		boolean punto=false;
		
		String email=JOptionPane.showInputDialog("Introduce tu dirección de email");
		
		for(int i=0; i<email.length();i++){
			
		if(email.charAt(i)=='@'){
			
			arroba++;
		}
		
		if(email.charAt(i)=='.'){
			
			punto=true;
		}
			
		}
		
		if (arroba==1 && punto==true){
		
		System.out.println("La dirección es correcta");

	}
	
	else{
		
		System.out.println("La dirección no es correcta");
	}

  }
}