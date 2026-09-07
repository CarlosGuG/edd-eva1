package eva1_4_objetos;

public class EVA1_4_OBJETOS {

    public static void main(String[] args) {
    Prueba prueba = new Prueba();
    System.out.print(prueba);
    //ELIMINAR prueba:
    //Terminar el programa ---> garbage collector (libera memoria automáticamente)
    //Eliminar "directamente" el objeto:
    prueba = null;
    }
    
}
class Prueba{
    
}