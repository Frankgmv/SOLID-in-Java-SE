package models;

import abstractas.Motocicleta;

public class MotoAcuatica extends Motocicleta{

    public void saltarOlas (){
        System.out.println("Salto de olas");
    }

    @Override
    public void avanzar() {
        System.out.println("Moto avanzando adelante");
    }

    @Override
    public void encenderMoto() {
        System.out.println("Moto encendida");
    }
}
