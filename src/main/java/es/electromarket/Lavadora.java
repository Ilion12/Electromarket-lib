package es.electromarket;

public class Lavadora extends Electrodomestico implements LavadoraInterfaz {

	private int capacidadCarga;
	
	public Lavadora() {}
	
	public Lavadora(long id, String marca, String modelo, char calificacionEnergetica, double precio, int capacidadCarga) {
		super( id, marca, modelo, calificacionEnergetica, precio);
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	@Override
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
}
