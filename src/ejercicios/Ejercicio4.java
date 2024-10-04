package ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        4. Números primos
        • Descripción: Dado el número a = 29, determina si es primo.
          Un número primo solo tiene dos divisores: 1 y él mismo.
        • Variables: a = 29.
         */
        int a = 29;
        int i = 2;
        int cont = 2;

        while (i < a) {
            if(a % i == 0) {
                cont++;
            }
            i++;
        }
        if (cont == 2) {
            System.out.println("El número "+a+" es primo");
        }
        else{
            System.out.println("El número "+a+" no es primo");
        }
        }

    }
