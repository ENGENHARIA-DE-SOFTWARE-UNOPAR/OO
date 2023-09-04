/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//import java.util.*;
package com.mycompany.numeropar;

/**
 *
 * @author AULA-1
 */
public class NumeroPar {

    public static void main(String[] args) {
        Scanner valor = new Scanner (System.in);
        System.out.println("Informe um número:  ");
        int numero = valor.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("O Numero é par.");
        }
        else{
            System.out.println("O numero digitado não é par");
        }
        System.exit(0);
        
    }
}
