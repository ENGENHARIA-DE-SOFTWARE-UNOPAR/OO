/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janelaExercicio.JanelaExercicio;
import javax.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Natan Ogliari
 */
public class diminuiLetras {
    
    public static  void lowCase() throws NullPointerException{
        
        String word = null;
        String newWord = null;
             
        
        word = JOptionPane.showInputDialog(null, "Digite um nome: ");
        
        
        
        newWord = word.toLowerCase();
        System.out.println("A palavra informada é: " + word);
        System.out.println("A palavra corrigida é: " + newWord);
    }   
}
