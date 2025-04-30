
package teatroframe;

public class Palco extends Boleto {
    public Palco(int numero) {
        super(numero);
        calcularPrecio();
    }

    @Override
    public void calcularPrecio() {
        precio = 100.0;
    }
}

