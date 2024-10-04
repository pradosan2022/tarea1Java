package ejercicios;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        11. Fibonacci
        • Descripción: Genera los primeros N = 10 números de la secuencia de Fibonacci,
          donde cada número es la suma de los dos anteriores. La secuencia comienza con 0 y 1.
        • Variables: N = 10.
         */
        int a = 0;
        int b = 1;
        int c;
        int N = 10;

        System.out.println("Los primeros "+N+" números de la secuencia de Fibonacci son: ");

        for (int i=0;i<N;i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
