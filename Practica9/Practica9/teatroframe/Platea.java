
package teatroframe;

public class Platea extends Boleto {
    private int diasAnticipacion;

    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        precio = (diasAnticipacion >= 10) ? 50.0 : 60.0;
    }
}

