package es.electromarket;

public class LavadoraImpl extends ElectrodomesticoImpl implements Lavadora {



	private int capacidadCarga;

	@Override
	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	@Override
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	public LavadoraImpl(int id, String marca, String modelo, char calificacionEnergetica, double precio, int capacidadCarga) {
		super(id, marca, modelo, calificacionEnergetica, precio);
		this.capacidadCarga = capacidadCarga;
	}

}
