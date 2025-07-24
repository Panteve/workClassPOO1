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
public class EjercisiosClase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notasAprobadas = 0;
        int notasReprobadas = 0;
        for(int i = 1; i <= 12;i++){
            float nota = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la nota "+i));
            if(nota <= 0 && nota >= 0){
                if(nota < 3){
                    notasReprobadas += 1;
                }else{
                  notasAprobadas += 1;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nota invalido");
                i--;
            }
        }
        JOptionPane.showMessageDialog(null, "Las notas aprobadas son: " +notasAprobadas);
        JOptionPane.showMessageDialog(null, "Las notas Reprobadas son: " +notasReprobadas);
    }

}
