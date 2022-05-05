package es.electromarket;

public class Lavadora extends Electrodomestico {

	public Lavadora() {}
	
	public Lavadora( String marca, String modelo, char calificacionEnergetica, double precio, int capacidadCarga) {
		super( marca, modelo, calificacionEnergetica, precio);
		this.capacidadCarga = capacidadCarga;
	}

	private int capacidadCarga;

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	
	
	

}
