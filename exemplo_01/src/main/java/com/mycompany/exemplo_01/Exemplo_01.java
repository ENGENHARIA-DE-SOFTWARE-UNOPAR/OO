/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_01;

/**
 *
 * @author AULA-1
 */
public class Exemplo_01 {
    String nome;
    String cor;
    
    public static void main(String[] args) {
        Exemplo_01 obj1 = new Exemplo_01(); //Instancia a classe
        
        obj1.nome = "R-950";
        obj1.cor = "Azul";
        
        System.out.println("Meu nome é "+ obj1.nome);
        System.out.println("Minha cor é "+ obj1.cor);
    }
}
