public class QuickSort {
    
    public static void main(String[] args) {
        int[] arreglo = {5,9,6,2,1,0,8,7,3,4};
        
        quicksort(arreglo, 0, arreglo.length - 1);
    }
    
    public static void quicksort(int[] arreglo, int izq, int der) {
        int pivote = arreglo[izq];
        int i = izq;
        int j = der;
        int swap;
        
        while(i < j) {
            while(arreglo[i] <= pivote && i < j) { 
                i++;
            }

            while(arreglo[j] > pivote) { 
                j--; 
            }

            if(i < j) {
                swap = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = swap;
            }
        }

        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;
        
        if(izq < j - 1) { 
            quicksort(arreglo, izq, j - 1); 
        }
        if(j + 1 < der) { 
            quicksort(arreglo, j + 1, der); 
        }   
    }
}