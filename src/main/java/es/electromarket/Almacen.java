package es.electromarket;

public class Almacen {

  private String localidad;
  private String idAlmacen;
  

  public String getLocalidad() {
    return localidad;
  }

  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }
  
  public String getIdAlmacen() {
	return idAlmacen;
  }

  public void setIdAlmacen(String idAlmacen) {
	this.idAlmacen = idAlmacen;
  }

  public Almacen() {

  }

  public Almacen(String localidad) {
    this.localidad = localidad;
  }

}
