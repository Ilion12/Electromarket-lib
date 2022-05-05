package es.electromarket;

public class Televisor extends Electrodomestico implements TelevisorInterfaz {


  private int numeroPulgadas;

  
  @Override
public int getNumeroPulgadas() {
    return numeroPulgadas;
  }

  @Override
public void setNumeroPulgadas(int numeroPulgadas) {
    this.numeroPulgadas = numeroPulgadas;
  }

  public Televisor(String marca, String modelo, char calificacionEnergetica, double precio,
      int numeroPulgadas) {
    super(marca, modelo, calificacionEnergetica, precio);
    this.numeroPulgadas = numeroPulgadas;
  }
  
  public Televisor() {}

}
