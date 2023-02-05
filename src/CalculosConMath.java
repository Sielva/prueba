
public class CalculosConMath {

	public static void main(String[] args) {
		/*Las clases predefinidas determinan el tipo de valor a introducir. Math.sqrt devuelve un número double, por lo tanto no se puede
		 * introducir un valor diferente a double en este caso
		 */
		
		//int raiz=Math.sqrt(9); está mal, da error porque introducimos un int cuando necesitamos un double
		
		//double raiz=Math.sqrt(9);
		
		double num1=5.85;
		
		int resultado1=(int)Math.round(num1);
		
		System.out.println(resultado1);
		
		double base=5;
		
		double exp=3;
		
		int resultado2=(int)Math.pow(base, exp);
		
		System.out.println("La potencia de " + base + " elevado a " + exp + " es igual a " + resultado2);
		
		//Es un ejemplo de refundición, para simular el tener que operar con variables double pero necesitar una respuesta de tipo int
	}
	
	

}
