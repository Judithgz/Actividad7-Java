package act7.compjava;
import java.util.Scanner;

public class Act7CompJava {

    
    public static void main(String[] args) {
        
        
        int numero, numero2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¡Numeros primos y Fibonacci!");
        System.out.println("¿Cual es el tope de tus numeros primos?: ");
        numero = leer.nextInt();
        
        System.out.println("¿Cuantos numeros de Fibonacci quieres ver?");
        numero2 = leer.nextInt();
        
        
        Primos lista = new Primos();
        Fibonacci lista2 = new Fibonacci();
        
        int[] PrimosArray = lista.generar(numero);
        int[] FibonacciArray = lista2.generar(numero2);
        
        System.out.println("Numeros primos");
        for(int i = 0; i <= numero; i++)
        {
            System.out.println(PrimosArray[i]);
        }
        
        System.out.println("Fibonacci");
        for(int i = 0; i <= numero; i++)
        {
            System.out.println(FibonacciArray[i]);
        }
        
        
    }
    
}
