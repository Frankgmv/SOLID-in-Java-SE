import Models.Bombilla;
import Models.BombillaControlColor;
import Models.BombillaControlPotencia;

public class Main {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();
        BombillaControlPotencia bombillaControlPotencia = new BombillaControlPotencia(100);
        BombillaControlColor bombillaControlColor = new BombillaControlColor("Blanco");

        bombilla.encender();

        bombillaControlColor.cambiarColor("Amarillo");

        bombillaControlPotencia.cambiarPotencia(10);

        bombilla.apagar();
    }
}