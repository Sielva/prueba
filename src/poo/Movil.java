package poo;

public class Movil {
	
	private int bateria, ram, memoria;
	
	private double pantalla;

	

	private String procesador;
	
	private String protector, funda;
	
	private double precio;
	
	public Movil() {
		
		int bateria=6000;
		
		double pantalla=5.5;
		
		String procesador="Qualcomm SnapDragon 4";
		
		double precio=150;
		
	}
	
	
	public void establece_ram(int memoria_ram) {
		
		ram=memoria_ram;
		
		if(memoria_ram!=8&&memoria_ram!=16) {
			
			System.out.println("Error al seleccionar la RAM.");
			
			ram=0;
			
		}if(ram==8) {
			
			precio+=25;
			
		}else if(ram==16) {
			
			precio+=45;
			
		}
		
	}
	
	public void establece_memoria(int cap_memoria) {
		
		memoria=cap_memoria;
		
		if(cap_memoria!=300&&cap_memoria!=750) {
			
			System.out.println("Error al introducir la capacidad de memoria.");
			
			memoria=0;
			
		}if(memoria==300) {
			
			precio+=20;
			
		}else if(memoria==750) {
			
			precio+=50;
			
		}
		
	}
	
	public void establece_protector(String protect) {
		
		protector=protect;
		
		if(protect.equalsIgnoreCase("si")) {
			
			precio+=1.5;
			
		}
		
	}
	
	public void establece_funda(String fund) {
		
		funda=fund;
		
		if(fund.equalsIgnoreCase("si")) {
			
			precio+=6;
			
		}
		
	}
	
	public String dime_datos_finales() {
		
		return "Características de tu configuración:\n"
				+ "Procesador: " + procesador +
				"\nCapacidad de batería: " + bateria + " mA."
				+ "\nDimensiones de la pantalla: " + pantalla + "''."
				+ "\nMemoria RAM: " + ram + " gb."
				+ "\nCapacidad de almacenamiento: " + memoria + " gb."
				+ "\nPrecio total: " + precio + " euros.";
		
	
	}

}
