package es.electromarket;

public abstract class Electrodomestico {
	
	protected String id;
	protected String marca;
	protected String modelo;
	protected char calificacionEnergetica; 
	protected double precio;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
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
	
	public Electrodomestico() {
		
	}
	public Electrodomestico( String marca, String modelo, char calificacionEnergetica, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.calificacionEnergetica = calificacionEnergetica;
		this.precio = precio;
	}
	
}