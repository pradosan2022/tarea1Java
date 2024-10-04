package ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
        8. Conversión de temperatura
        • Descripción: Dado que la temperatura es c = 25 grados Celsius, conviértela a Fahrenheit usando
         la fórmula: (9 x C)/5 + 32
        • Variables: c = 25.
         */
        int c = 25;
        int fahrenheit;
        fahrenheit = (9 * c)/5 +32;
        System.out.println("La temperatura ingresada en Celsius "+c+" es igual a "+fahrenheit+ " grados Fahrenheit");
    }
}
