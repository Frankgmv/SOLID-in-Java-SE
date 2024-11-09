package Models;

import Interfaces.Switchable;

public class Bombilla implements Switchable {
    private String estado;

    public Bombilla() {
        this.estado = "Apagado";
    }

    public Bombilla(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public void apagar() {
        System.out.println("apagar bombilla");
    }

    @Override
    public void encender() {
        setEstado("encendido");
        System.out.println("encender bombilla");
    }
}
