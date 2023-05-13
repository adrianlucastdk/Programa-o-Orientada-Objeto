package com.mycompany.exerciciooverlo4d;

public class ExercicioOverLo4d {

       public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        int[] resultado = {4, 5, 9};
        
        System.out.println(calc.somar(5, 3));
        System.out.println(calc.somar(2.5, 2.5));
        System.out.println(calc.somar(resultado));
        
    }
}
