/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenavel;

/**
 *
 * @author aluno
 */
public class BubbleSort implements Ordenavel {
   public BubbleSort(){
   }
   
   @Override
   public void ordenar(int[]array){
       int aux;
       for (int i = 0; i<array.length; i++){
       for(int j = 1; j<array.length; j++)
        {
       if (array[j-1]>=array[j]){
           aux = array[j-1];
           array[j-1] = array [j];
           array[j] = aux;
            }
        }
        aux = 0;
    }   
}
   
public void bubbleSort(int[] array){
    ordenar(array);
    }
}