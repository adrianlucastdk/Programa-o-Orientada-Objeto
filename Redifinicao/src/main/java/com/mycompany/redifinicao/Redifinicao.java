/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redifinicao;

/**
 *
 * @author aluno
 */
public class Redifinicao {
    public static void main(String[] args){
    Animal animal = new Animal();
    animal.fazerBarulho();
    animal = new Cachorro();
    animal.fazerBarulho();
    animal = new Gato();
    animal.fazerBarulho();
    }
}
