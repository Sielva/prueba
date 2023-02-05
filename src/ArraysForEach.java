import javax.swing.*;
public class ArraysForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] matriz_al=new int[150];
		
		for(int i=0;i<matriz_al.length;i++) {
			
			matriz_al[i]=(int)Math.round(Math.random()*100);
			
		}
		
		for(int numeros:matriz_al) {
			
			System.out.print(numeros + " ");
			
		}
			
		}

	}

