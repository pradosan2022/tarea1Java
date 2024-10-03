package ejercicios;

public class Ejercicio3 {
    public static void main(String[] args){
        /*
        * Número par o impar
•	Descripción: Dado el número a = 15, determina si es par o impar. Un número es par si es divisible por 2, y es impar si no lo es.
•	Variables: a = 15.
         **/
        int a = 15;
        int resto = a % 2;
        if(resto==0) {
            System.out.println("a es un número par y almacena: " + a);
        }   else{
                System.out.println("a es un número impar y almacena: "+a);
            }
    }
}
