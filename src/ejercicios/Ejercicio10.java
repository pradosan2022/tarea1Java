package ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        10. Factorial de un número
        • Descripción: Dado el número a = 6, calcula su factorial.
          El factorial de un número se obtiene multiplicando todos los números desde 1 hasta el número dado.
        • Variables: a = 6.
         */
        int a = 6;
        int factorial = 1;
        int n = 2;

        while (n<=a){
            factorial = factorial * n;
            n = n + 1;
        }
        System.out.println("El factorial de "+a+" es: "+factorial);
    }
}
