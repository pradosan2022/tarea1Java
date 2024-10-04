package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         5. Máximo de tres números
            • Descripción: Dados los números a = 5, b = 12 y c = 9, encuentra cuál de ellos es el mayor.
            • Variables: a = 5, b = 12, c = 9.
          */
        int a = 5;
        int b = 12;
        int c = 9;

        if(a > b){
            if(a > c){
                System.out.println("El mayor es: "+a);
            }
            else{
                System.out.println("El mayor es: "+c);
            }
        }
        else if(b > c){
            System.out.println("El mayor es: "+b);
        }
        else{
            System.out.println("El mayor es: "+c);
        }
    }
}
