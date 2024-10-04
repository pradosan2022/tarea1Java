package ejercicios;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
        9. Suma de los primeros N números naturales
        • Descripción: Dado el número N = 50, calcula la suma de los primeros N números naturales.
          Los números naturales son los enteros positivos comenzando desde 1.
        • Variables: N = 50.
         */
        int N = 50;
        int suma = 0;
        int i=1;

        while (i<=N){
            suma = suma +i;
            i = i+1;
        }
        System.out.println("La suma de los primeros "+N+" números naturales es: "+suma);
    }
}
