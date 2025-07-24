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
public class EjercisiosClase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadProductos;
        float suma = 0;
        float precio;
        cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos")) ;
         if (cantidadProductos < 0) {
            cantidadProductos = (cantidadProductos * (-1));
        }
        for(int i = 1; i <= cantidadProductos;i++){
            precio =  Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto "+ i));
            if(precio < 0){
                JOptionPane.showMessageDialog(null, "Precion invalido");
                i--;
            }else{
                suma += precio;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de los precios es: " +suma);
    }

}
