package mde.entidades;

public class Lavadora extends Electrodomestico {



	private int capacidadCarga;

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	public Lavadora(int id, String marca, String modelo, char calificacionEnergetica, double precio, int capacidadCarga) {
		super(id, marca, modelo, calificacionEnergetica, precio);
		this.capacidadCarga = capacidadCarga;
	}

}
