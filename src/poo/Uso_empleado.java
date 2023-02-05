package poo;

import java.util.*;

public class Uso_empleado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Roberto", 40000, 2011, 12, 17);
		
		Empleado empleado2=new Empleado("Julio", 37200, 2015, 3, 2);
		
		Empleado empleado3=new Empleado("Laura", 51000, 2008, 7, 26);
		
		empleado1.aumentoSueldo(5);
		
		empleado2.aumentoSueldo(5);
		
		empleado3.aumentoSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dime_nombre() + " Sueldo: " + empleado1.dime_sueldo()
				+ " Fecha de alta inicial: " + empleado1.dime_fecha());
		
		System.out.println("Nombre: " + empleado2.dime_nombre() + " Sueldo: " + empleado2.dime_sueldo()
		+ " Fecha de alta inicial: " + empleado2.dime_fecha());
		
		System.out.println("Nombre: " + empleado3.dime_nombre() + " Sueldo: " + empleado3.dime_sueldo()
		+ " Fecha de alta inicial: " + empleado3.dime_fecha());*/
		
		Empleado[] fichaEmpleados=new Empleado[4];
		
		fichaEmpleados[0]=new Empleado("Roberto ", 40000, 2011, 12, 17);
		
		fichaEmpleados[1]=new Empleado("Julio ", 37200, 2015, 3, 2);
		
		fichaEmpleados[2]=new Empleado("Laura ", 51000,2008, 7, 26);
		
		fichaEmpleados[3]=new Empleado("Mariano");
		
		/*for(int i=0;i<fichaEmpleados.length;i++) { //bucle for para array
			
			fichaEmpleados[i].aumentoSueldo(5);
			
		}*/
		
		for(Empleado e: fichaEmpleados) {
			
			e.aumentoSueldo(5);
			
		}
		
		for(Empleado e: fichaEmpleados) {
			
			System.out.println("Nombre: " + e.dime_nombre() + " Sueldo: " + e.dime_sueldo()
					 + " Fecha de alta inicial: " + e.dime_fecha());
			
		}
		
		/*for(int i=0;i<fichaEmpleados.length;i++) {
			
			System.out.println("Nombre: " + fichaEmpleados[i].dime_nombre() + " Sueldo: " + fichaEmpleados[i].dime_sueldo()
					 + " Fecha de alta inicial: " + fichaEmpleados[i].dime_fecha());
			
		}*/

	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int annum, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar fecha=new GregorianCalendar(annum, mes-1, dia);
		
		altaContrato=fecha.getTime();
		
	}
	public Empleado(String nom){
		
		this(nom, 30000, 2000, 1 , 1);
		
	}
	
	public String dime_nombre() { //getter
		
		return nombre;
		
	}
	
	public double dime_sueldo() { //getter
		
		return sueldo;
	}
	
	public Date dime_fecha() { //getter
		
		return altaContrato;
	}
	
	public void aumentoSueldo(double porcentaje) { //setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
}
