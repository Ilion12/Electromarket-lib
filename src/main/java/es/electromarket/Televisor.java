package es.electromarket;

public class Televisor extends Electrodomestico implements TelevisorInterfaz  {

  private int numeroPulgadas;

 @Override
  public int getNumeroPulgadas() {
    return numeroPulgadas;
  }

  @Override
  public void setNumeroPulgadas(int numeroPulgadas) {
    this.numeroPulgadas = numeroPulgadas;
  }
  
  public Televisor() {}
  
  public Televisor(long id, String marca, String modelo, char calificacionEnergetica, double precio,
      int numeroPulgadas) {
    super(id, marca, modelo, calificacionEnergetica, precio);
    this.numeroPulgadas = numeroPulgadas;
  }
  
}
