
package cola;

class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int size;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.size = 0;
    }

    public void insert(long e) {
        if (!isFull()) {
            fin = (fin + 1) % n;
            arreglo[fin] = e;
            size++;
        } else {
            System.out.println("Cola llena, no se puede insertar");
        }
    }

    public long remove() {
        if (!isEmpty()) {
            long elemento = arreglo[inicio];
            inicio = (inicio + 1) % n;
            size--;
            return elemento;
        } else {
            System.out.println("Cola vacía, no se puede remover");
            return -1;
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[inicio];
        } else {
            System.out.println("Cola vacía");
            return -1;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Cola Vacía";
        }
        String resultado = "[";
        for (int i = 0; i < size; i++) {
            int index = (inicio + i) % n;
            resultado += arreglo[index];
            if (i < size - 1) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }

    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        System.out.println("Elemento al frente: " + cola.peek());
        System.out.println("Cola completa: " + cola);
        cola.remove();
        System.out.println("Después de hacer remove: " + cola);
    }
}

