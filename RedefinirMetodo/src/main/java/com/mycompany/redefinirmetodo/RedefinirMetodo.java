/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redefinirmetodo;

/**
 *
 * @author aluno
 */
public class RedefinirMetodo{
    
    public static void main(String[] args){
    Animal animal = new Cachorro();
    animal.emitirSom();
    animal = new Gato();
    animal.emitirSom();
    animal = new Elefante();
    animal.emitirSom();
}
}
