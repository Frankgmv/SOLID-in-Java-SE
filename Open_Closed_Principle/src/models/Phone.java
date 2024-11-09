package models;

public abstract class Phone {
    private  String marca;
    private  String modelo;
    private  String camara;

    public Phone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Phone() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void mostrarInfo();

    public abstract void tomarFoto();

}
