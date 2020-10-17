public class QuickSort {

    public static void main(final String[] args) {

        final int[] arreglo = { 5, 9, 6, 2, 1, 0, 8, 7, 3, 4 };

        imprimeArreglo(arreglo);

        quicksort(arreglo, 0, arreglo.length - 1);

        imprimeArreglo(arreglo);

    }

    public static void imprimeArreglo(final int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        System.out.println("----------------------");

    }

    public static void quicksort(final int[] arreglo, final int izq, final int der) { // [8 7 6 9] 6 9

        // ELEGIR PIVOTE EN ESTE CASO EL PRIMERO DE TODOS.
        final int pivote = arreglo[izq];
        
        // LOS ELEMENTOS > AL PIVOTE VAN A LA DERECHA, LOS < A LA IZQUIERDA
        // VARIABLES AUXILIARES: 
        // i PARA LOS ELEMENTOS DE LA IZQUIERDA
        // j PARA LOS ELEMENTOS DE LA DERECHA
        int i = izq;
        int j = der;
        
        int swap;
        
        /*
        [5,4,6,2,1,0,8,7,3,9];
        i = 5
        j = 5
        pivot = 5

    
        */
        // SE EVALUAN LOS ELEMENTOS PARA UBICAR EL NUEVO PIVOTE
        while(i < j) {
            // MIENTRAS QUE arreglo[i] SEA MENOR O IGUAL AL PIVOTE SE AUMENTA EL VALOR DE i
            // CUANDO NO SE CUMPLE EL WHILE, EL ELEMENTO EN arreglo[i] ES MAYOR AL PIVOTE
            // Y DEBE IR A LA DERECHA
            while(arreglo[i] <= pivote && i < j) {
                i++;
            }
            // MIENTRAS QUE EL arreglo[j] SEA MAYOR AL PIVOTE SE DISMINUYE j
            // CUANDO NO SE CUMPLE EL WHILE EL ELEMENTO EN arreglo[j] ES MENOR O IGUAL AL PIVOTE
            // Y DEBE IR A LA IZQUIERDA
            while(arreglo[j] > pivote) {
                j--;
            }
            // SIEMPRE Y CUANDO i SEA MENOR A j, SE HACE UN CAMBIO DE LOS ELEMENTOS
            if(i < j) {
                swap = arreglo[i]; // 6 
                arreglo[i] = arreglo[j]; // 3
                arreglo[j] = swap;
                
                imprimeArreglo(arreglo);
            }
        }


        arreglo[izq] = arreglo[j]; // ACÁ SE MUEVE AL PIVOT A SU POSICION. 
        arreglo[j] = pivote; 
        
        if(izq < j - 1) {
            quicksort(arreglo, izq, j - 1); // LLAMADA RECURSIVA CON EL INDICE DERECHO CON EL INDICE DEL PIVOT - 1 => [0 4 3 2 1 5 8 7 6 9] -> [0 4 3 2 1]
        }
        if(j + 1 < der) {
            quicksort(arreglo, j + 1, der);  // LLAMADA RECURSIVA CON EL INDICE IZQUIERDO CON EL INDICE DEL PIVOT + 1 => [0 4 3 2 1 5 8 7 6 9] -> [8,7,6,9]
        }   
    }
}