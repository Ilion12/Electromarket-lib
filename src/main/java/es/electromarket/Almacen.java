package es.electromarket;

import java.util.Collection;

public class Almacen {

  private String localidad;
  private long idAlmacen;
  private Collection<Electrodomestico> electrodomesticos;
  
  public Collection<Electrodomestico> getElectrodomesticos() {
	return electrodomesticos;
  }

  public void setElectrodomesticos(Collection<Electrodomestico> electrodomesticos) {
	this.electrodomesticos = electrodomesticos;
  }

  public String getLocalidad() {
    return localidad;
  }

  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }
  
  public long getIdAlmacen() {
	return idAlmacen;
  }

  public void setIdAlmacen(long idAlmacen) {
	this.idAlmacen = idAlmacen;
  }

  public Almacen() {

  }

  public Almacen(String localidad, long idAlmacen, Collection<Electrodomestico> electrodomesticos) {
    this.localidad = localidad;
    this.idAlmacen = idAlmacen;
    this.electrodomesticos = electrodomesticos;
  }

}
