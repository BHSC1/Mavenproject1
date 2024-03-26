/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1072419878
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        if ((numero % 10) == 0) {
            JOptionPane.showMessageDialog(null, "É múltiplo de 10!");
        } else{
            if((numero % 2) == 0){
                JOptionPane.showMessageDialog(null, "É múltiplo de 2!");
            } else {
                if ((numero % 5) == 0) {
                    JOptionPane.showMessageDialog(null, "É múltiplo de 5!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não é multiplo destes!");
                }

            }
        }
    }
}