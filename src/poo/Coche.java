package poo;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_chasis;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas=4;
		
		largo=4000;
		
		ancho=2500;
		
		motor=1974;
		
		peso_chasis=790;
		
	}
	
	public String dime_datos_generales() {  //MÉTODO GETTER
		
		return "El chasis del vehículo tiene " + ruedas + " ruedas. " +
		"Mide " + largo/1000 + " metros con un ancho de " + ancho/1000 + " metros. " + 
		"El peso del chasis completo es " + peso_chasis + " kilogramos. " + 
		"Monta un motor de " + motor + " centímetros cúbicos.";
		
		
	}
	
	
	public void establece_color(String color_coche){  //MÉTODO SETTER
		
		color=color_coche;
		
	}
	
	public String dime_color() {  //Otro método getter que acompaña al setter de arriba.
		
		return "El color del vehículo es " + color;
		
	}
	
	public void establece_asientos(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero=true;	
			
		}else {
			this.asientos_cuero=false;
		}
	}
		
		public String dime_asientos(){
			
			if (asientos_cuero==true) {
				
				return "El coche tiene asientos de cuero.";
				
			}else {
				
				return "El coche tiene asientos de tela.";		
			}
			
		}
		
		public void configura_climatizador(String climatizador) { //setter
			
			if(climatizador.equalsIgnoreCase("si")) {
				
				this.climatizador=true;
				
			}else {
				
				this.climatizador=false;
				
			}
			
		}
		
		public String dime_climatizador() { //getter
			
			if (climatizador==true) {
				
				return "El coche tiene equipado climatizador.";
				
			}
			
			else {
				
				return "El coche no tiene climatizador equipado.";
				
			}
			
		}
		
		
		public String dime_peso_coche() { //setter + getter (no recomendado, mejor por separado)
			
		int peso_carroceria=500;
		
		peso_total=peso_chasis+peso_carroceria;
		
		if (asientos_cuero==true){
			
			peso_total=peso_total+50;
		}
		
		if(climatizador==true) {
			
			peso_total=peso_total+10;
			
		}
		
		return "El peso del vehículo es " + peso_total + " kg.";
		
		}
		
		public int precio_coche() { //getter
			
		
		int precio_final=12500;
		
		if(asientos_cuero==true) {
			
			precio_final+=500;
			
		}
		
		if (climatizador==true){
			
			precio_final+=300;
			
		}
		
		return precio_final;
		
		}
				
	}
