package act7.compjava;


public class Fibonacci {
    
    int[] FibonacciArray = new int[101];
    public int[] generar(int limite)
    {
        int fibo = 0;
        int aux = 1;
        int aux2;
        
        for(int i = 0; i <= limite; i++)
        {
            aux2 = fibo;
            fibo = aux + fibo;
            aux = aux2;
            FibonacciArray[i] = aux;
        }
        
        return FibonacciArray;
    }
    
}
