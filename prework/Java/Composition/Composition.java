package Java.Composition;

public class Composition {
    public static void main(String[] args) {
        Desktop desktop1 = new Desktop("Escritorio Chachi", new Monitor(123, "Bq"), new Keyboard(123), new Tower(123));
    
        System.out.println(desktop1.getTower().getModelNum());
    
    

    }
}
