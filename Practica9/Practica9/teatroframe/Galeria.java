
package teatroframe;

public class Galeria extends Boleto {
    private int diasAnticipacion;

    public Galeria(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        precio = (diasAnticipacion >= 10) ? 25.0 : 30.0;
    }
}

