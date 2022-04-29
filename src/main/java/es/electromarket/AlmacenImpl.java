package es.electromarket;

import java.util.ArrayList;
import java.util.List;

public class AlmacenImpl implements Almacen {
	
	private String localidad;
	
	private List<ElectrodomesticoImpl> stock = new ArrayList<ElectrodomesticoImpl>();

	@Override
	public List<ElectrodomesticoImpl> getStock() {
		return stock;
	}

	@Override
	public void setStock(List<ElectrodomesticoImpl> stock) {
		this.stock = stock;
	}

	@Override
	public String getLocalidad() {
		return localidad;
	}

	@Override
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public AlmacenImpl(String localidad, List<ElectrodomesticoImpl> stock) {
		super();
		this.localidad = localidad;
		this.stock = stock;
	}
	
	
}
