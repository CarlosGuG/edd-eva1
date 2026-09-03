public class App {
    public static void main(String[] args) throws Exception {
        A();
    }
    public static void A(){
        B();
    }
    public static void B(){
        int i = 5;
        double d = 5.5;
        A();
    }
}
