package es.electromarket;

import java.util.ArrayList;
import java.util.List;

public class AlmacenImpl {
	
	private String localidad;
	
	private List<ElectrodomesticoImpl> stock = new ArrayList<ElectrodomesticoImpl>();

	
	public List<ElectrodomesticoImpl> getStock() {
		return stock;
	}

	
	public void setStock(List<ElectrodomesticoImpl> stock) {
		this.stock = stock;
	}

	
	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public AlmacenImpl(String localidad, List<ElectrodomesticoImpl> stock) {
		super();
		this.localidad = localidad;
		this.stock = stock;
	}
	
	
	
	
}
