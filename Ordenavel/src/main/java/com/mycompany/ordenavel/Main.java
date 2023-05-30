
/* 2. Crie uma interface chamada Ordenavel com um método ordenar() que recebe um array de inteiros e o ordena em ordem crescente. 
Em seguida, implemente essa interface em uma classe chamada BubbleSort que implementa o algoritmo de ordenação Bubble Sort.
*/

package com.mycompany.ordenavel;


public class Main {
    public static void main(String[] args) {
        int[] array = {1,20,50,60,30,10,9,0};
        BubbleSort bSort = new BubbleSort();
        bSort.ordenar(array);
        
        for(int i = 0; i < array.length; i++) {
            System.out.println("array["+i+"] = "+array[i]);
        }
    }
}
