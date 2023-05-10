/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1005;

/**
 *
 * @author aluno
 */
public class Ex1005 {
    public static void main(String[] args) {
       Animal animal = new Cachorro();
       animal.emitirSom();
       animal.mover();
       animal = new Gato();
       animal.emitirSom();
       animal.mover();
    
    }
}
