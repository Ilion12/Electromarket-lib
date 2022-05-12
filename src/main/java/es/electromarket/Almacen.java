package es.electromarket;

public class Almacen {

  private String localidad;
  private long idAlmacen;
  

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

  public Almacen(String localidad) {
    this.localidad = localidad;
  }

}
