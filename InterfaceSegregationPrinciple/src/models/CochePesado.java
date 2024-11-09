package models;

import Interfaces.*;

public class CochePesado implements Coche, CocheCargador {
    @Override
    public void arrancar() {
        System.out.println("Arrancar");
    }

    @Override
    public void encender() {
        System.out.println("Encender");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar");
    }

    @Override
    public void llevarCarga() {
        System.out.println("Llevando carga");
    }
}
