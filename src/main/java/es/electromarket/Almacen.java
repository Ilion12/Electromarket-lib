package es.electromarket;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

  private String localidad;
  private List<Electrodomestico> stock = new ArrayList<Electrodomestico>();


  public String getLocalidad() {
    return localidad;
  }

  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }

  public List<Electrodomestico> getStock() {
    return stock;
  }


  public void setStock(List<Electrodomestico> stock) {
    this.stock = stock;
  }

  public Almacen() {

  }

  public Almacen(String localidad, List<Electrodomestico> stock) {
    this.localidad = localidad;
    this.stock = stock;
  }

}
