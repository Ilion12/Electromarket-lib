package es.electromarket;

public class ElectrodomesticoImpl implements Electrodomestico {
	
	private int id;
	private String marca;
	private String modelo;
	private char calificacionEnergetica; 
	private double precio;
	
	
	
	@Override
	public int getId() {
		return id;
	}



	@Override
	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String getMarca() {
		return marca;
	}



	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}



	@Override
	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public char getCalificacionEnergetica() {
		return calificacionEnergetica;
	}
	
	@Override
	public void setCalificacionEnergetica(char calificacionEnergetica) {
		this.calificacionEnergetica = calificacionEnergetica;
	}



	@Override
	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public ElectrodomesticoImpl(int id, String marca, String modelo, char calificacionEnergetica, double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.calificacionEnergetica = calificacionEnergetica;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	
	
	
	
}