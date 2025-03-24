
package mainecuacion;

public class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public String getRaices() {
        double d = getDiscriminante();
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            return "La ecuacion tiene dos raices: " + r1 + " y " + r2;
        } else if (d == 0) {
            double r1 = -b / (2 * a);
            return "La ecuacion tiene una raiz: " + r1;
        } else {
            return "La ecuacion no tiene raices reales";
        }
    }
}
