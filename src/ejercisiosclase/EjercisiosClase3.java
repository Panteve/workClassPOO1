/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisiosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author uestudiantes
 */
public class EjercisiosClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i <= 150; i++) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null,"La suma es: "+ suma);
    }

}
