
package mainestadistica;

public class Estadisticas {
    private double[] numeros;

    public Estadisticas(double[] numeros) {
        this.numeros = numeros;
    }

    public double getPromedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public double getDesviacionEstandar() {
        double promedio = getPromedio();
        double suma = 0;
        for (double num : numeros) {
            suma += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }
}
