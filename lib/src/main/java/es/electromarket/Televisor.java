package es.electromarket;

public class Televisor extends Electrodomestico {


  private int numeroPulgadas;

  public int getNumeroPulgadas() {
    return numeroPulgadas;
  }

  public void setNumeroPulgadas(int numeroPulgadas) {
    this.numeroPulgadas = numeroPulgadas;
  }

  public Televisor(int id, String marca, String modelo, char calificacionEnergetica, double precio,
      int numeroPulgadas) {
    super(id, marca, modelo, calificacionEnergetica, precio);
    this.numeroPulgadas = numeroPulgadas;
  }


}
