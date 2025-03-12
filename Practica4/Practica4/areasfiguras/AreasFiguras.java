
package areasfiguras;

class AreasFiguras {
    // Área de un círculo
    public static double calcular(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Área de un triángulo rectángulo
    public static double calcular(double base, double altura) {
        return base * altura;
    }

    // Área de un trapecio
    public static double calcular(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }

    // Área de un pentágono
    public static double calcular(double lado, double apotema, int numLados) {
        return (numLados * lado * apotema) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Area del circulo: " + calcular(5));
        System.out.println("Area del rectangulo: " + calcular(10, 4));
        System.out.println("Area del triangulo rectangulo: " + (calcular(6, 3) / 2));
        System.out.println("Area del trapecio: " + calcular(8, 6, 4));
        System.out.println("Area del pentagono: " + calcular(5, 3.5, 5));
    }
}

