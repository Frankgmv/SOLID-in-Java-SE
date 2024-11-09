package Interfaces;

import abstractas.Motocicleta;

public class MotoTerrestre extends Motocicleta {
    @Override
    public void avanzar() {
        System.out.println("Moto avanzando");
    }

    @Override
    public void encenderMoto() {
        System.out.println("Moto encendida");
    }

    public  void picarMoto(){
        System.out.println("Picar moto");
    }
}
