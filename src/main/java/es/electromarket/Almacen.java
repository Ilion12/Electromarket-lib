package es.electromarket;

import java.util.List;

public interface Almacen {

	List<ElectrodomesticoImpl> getStock();

	void setStock(List<ElectrodomesticoImpl> stock);

	String getLocalidad();

	void setLocalidad(String localidad);

}