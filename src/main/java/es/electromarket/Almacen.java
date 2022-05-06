package es.electromarket;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
	
	private List<Electrodomestico> stock = new ArrayList<Electrodomestico>();

	
	public List<Electrodomestico> getStock() {
		return stock;
	}

	
	public void setStock(List<Electrodomestico> stock) {
		this.stock = stock;
	}

	public Almacen() {
		
	}

	public Almacen(List<Electrodomestico> stock) {
		super();
		this.stock = stock;
	}
	
}
