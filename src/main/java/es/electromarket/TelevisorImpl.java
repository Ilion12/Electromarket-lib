package es.electromarket;

public class TelevisorImpl extends ElectrodomesticoImpl implements Televisor {


  private int numeroPulgadas;

  @Override
public int getNumeroPulgadas() {
    return numeroPulgadas;
  }

  @Override
public void setNumeroPulgadas(int numeroPulgadas) {
    this.numeroPulgadas = numeroPulgadas;
  }

  public TelevisorImpl(long id, String marca, String modelo, char calificacionEnergetica, double precio,
      int numeroPulgadas) {
    super(id, marca, modelo, calificacionEnergetica, precio);
    this.numeroPulgadas = numeroPulgadas;
  }
  
  public TelevisorImpl() {
	  
  }


}
