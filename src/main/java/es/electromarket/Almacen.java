package es.electromarket;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
	
	private String localidad;
	
	private List<Electrodomestico> stock = new ArrayList<Electrodomestico>();

	public List<Electrodomestico> getStock() {
		return stock;
	}

	public void setStock(List<Electrodomestico> stock) {
		this.stock = stock;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Almacen(String localidad, List<Electrodomestico> stock) {
		super();
		this.localidad = localidad;
		this.stock = stock;
	}
	
	
}
