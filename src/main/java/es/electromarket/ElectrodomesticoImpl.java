package es.electromarket;

public abstract class ElectrodomesticoImpl {
	
	private long id;
	private String marca;
	private String modelo;
	private char calificacionEnergetica; 
	private double precio;
	
	public ElectrodomesticoImpl(long id, String marca, String modelo, char calificacionEnergetica, double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.calificacionEnergetica = calificacionEnergetica;
		this.precio = precio;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public char getCalificacionEnergetica() {
		return calificacionEnergetica;
	}
	public void setCalificacionEnergetica(char calificacionEnergetica) {
		this.calificacionEnergetica = calificacionEnergetica;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

	
	
	
}