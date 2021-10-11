package act7.compjava;


public class Primos {
    
    int limite;
    int PrimosArray[] = new int[101];
    int indice = 0;
    
    public int[] generar(int limite)
    {
        for(int i = 1; i <= limite; i++)
        {
            int contador = 0;
            
            for(int j = 1; j <= limite; j++)
            {
                if(i % j == 0)
                {
                    contador++;
                }
            }
            
            if(contador == 2)
            {
                PrimosArray[indice++] = i;
            }
        }
        
        return PrimosArray;
    }
    
}