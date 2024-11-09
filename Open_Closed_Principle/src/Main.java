import models.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "15 pro max", 2024);

        iphone.mostrarInfo();
        iphone.tomarFoto();
    }
}