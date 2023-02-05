package poo;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados empleado1=new Empleados("Alejandro");
		
		Empleados empleado2=new Empleados("Lidia");
		
		empleado1.cambiaSeccion("Finanzas");
		
		System.out.println(empleado1.devuelveDatos());
		
		System.out.println(empleado2.devuelveDatos() + "\nSiguiente ID: " + Empleados.dimeIdSiguiente());

	}

}

class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public static int dimeIdSiguiente(){
		
		return IdSiguiente;
	}
	
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	
	public String devuelveDatos(){
		
		return "Nombre: " + nombre + ", Sección: " + seccion + ", Id: " + Id;
	}
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
}
