import models.CochePesado;
import models.CocheRapido;

public class Main {
    public static void main(String[] args) {
        CocheRapido cocheRapido = new CocheRapido();
        CochePesado cochePesado = new CochePesado();


        cocheRapido.encender();
        cocheRapido.arrancar();
        cocheRapido.irAAlataVelocidad();
        cocheRapido.frenar();

        System.out.println("");

        cochePesado.encender();
        cochePesado.arrancar();
        cochePesado.llevarCarga();
        cochePesado.frenar();
    }

}