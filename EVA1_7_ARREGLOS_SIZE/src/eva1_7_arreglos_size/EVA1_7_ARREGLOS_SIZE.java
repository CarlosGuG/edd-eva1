/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos_size;

/**
 *
 * @author HP
 */
public class EVA1_7_ARREGLOS_SIZE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] original = new int[10];
        for (int i = 0; i < original.length; i++) { // LLENAR CON DATOS ALEATORIOS
            original[i] = (int)(Math.random() *100);
        }
        for (int i = 0; i < original.length; i++) { //IMPRIMIR
            System.out.println("(" + original[i] + ")");
        }
        System.out.println("");
        //CAMBIAR EL TAMAÑO (NO SE PUEDE)
        //Respaldo
        int[] originalCopia = original; //COPIO LA DIRECCION DEL ARREGLO ARIGINAL
        original = new int[5]; //AQUI DESCONECTAMOS EL ARREGLO DE TAMAÑO 10 Y LO REEMPLAZAMOS
        System.out.println(original);
        
        //TRANFERIR LA INFORMACION
        for (int i = 0; i < original.length; i++) {
            original[i] = originalCopia[i];
        }
        for (int i = 0; i < original.length; i++) { //IMPR IMIR ARREGLO "MODIFICADO"
            System.out.println("(" + original[i] + ")");
    }
        
        
   }
}
