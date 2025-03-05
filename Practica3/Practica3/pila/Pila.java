
package pila;

class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.top = -1;
    }

    public void push(long e) {
        if (!isFull()) {
            top++;
            arreglo[top] = e;
        } else {
            System.out.println("Pila llena, no se puede agregar el elemento");
        }
    }

    public long pop() {
        if (!isEmpty()) {
            long elemento = arreglo[top];
            top--;
            return elemento;
        } else {
            System.out.println("Pila vacía, no se puede extraer el elemento");
            return -1;
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[top];
        } else {
            System.out.println("Pila vacía");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }

    @Override
    public String toString() {
        String resultado = "[";
        for (int i = 0; i <= top; i++) {
            resultado += arreglo[i];
            if (i < top) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }

    // Aquí está el método MAIN dentro de la clase Pila
    public static void main(String[] args) {
        Pila pila = new Pila(5);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Elemento en el tope: " + pila.peek());
        System.out.println("Pila completa: " + pila);
        pila.pop();
        System.out.println("Después de hacer pop: " + pila);
    }
}

