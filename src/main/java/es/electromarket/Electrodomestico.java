package es.electromarket;

public interface Electrodomestico {

	int getId();

	void setId(int id);

	String getMarca();

	void setMarca(String marca);

	String getModelo();

	char getCalificacionEnergetica();

	void setCalificacionEnergetica(char calificacionEnergetica);

	double getPrecio();

}