/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_4dimensiones;

/**
 *
 * @author bisonte
 */
public class EVA1_10_4DIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][] arreglo = new int [2][2][2][2]; //ALMACENA 16 ENTEROS
        for (int i = 0; i < arreglo.length;i++) { //1er dimension
            for (int j = 0; j < arreglo[i].length;j++) { //2da dimension
                for (int k = 0; k < arreglo[i][j].length;k++) { //3ra dimension
                    for (int l = 0; l < arreglo[i][j][k].length;l++) { //4ta dimension
                        arreglo[i][j][k][l] = (int)(Math.random() * 100);
                    }
                }
            }
               
        }
        for (int i = 0; i < arreglo.length;i++)
            for (int j = 0; j < arreglo[i].length;j++) {
                for (int k = 0; k < arreglo[i][j].length;k++) {
                    for (int l = 0; l < arreglo[i][j][k].length;l++) {
                        System.out.println("[" + arreglo[i][j][k][l] + "]");
                    }
                }
            }
         }
}
         
