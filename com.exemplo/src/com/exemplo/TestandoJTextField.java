/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exemplo;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author AULA-1
 */
public class TestandoJTextField extends JFrame{
    private static final long serialVersionUID = 1L;

       private JTextField txtExemplo;

    public static void main(String[] args)
    {
       TestandoJTextField field = new TestandoJTextField();
       field.testaJTextField();
    }

    private void testaJTextField(){
             this.setTitle("inicio"); //Nome da janela
        this.setSize(200, 180); //size janela

        //Definimos o tamanho padrão do JTextField
        txtExemplo = new JTextField(10);

        //Passamos para o construtor o número máximo de caracteres aceitos
        txtExemplo.setDocument(new TamanhoFixoJTextField(5));

        this.getContentPane().add(txtExemplo, "North");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
