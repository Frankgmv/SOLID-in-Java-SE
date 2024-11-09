package models;

import Interfaces.Coche;

public class CocheRapido implements Coche {
    @Override
    public void arrancar() {
        System.out.println("Arrancar coche");
    }

    @Override
    public void encender() {
        System.out.println("Encender coche");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar coche");
    }

    public void irAAlataVelocidad(){
        System.out.println("Acelerando a fondo");
    }
}

