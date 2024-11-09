package models;

public class Iphone extends Phone{
    private int year;

    public Iphone() {
    }

    public Iphone(String marca, String modelo, int year) {
        super(marca, modelo);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("marca: "+getMarca()
        +", modelo: "+ getModelo() + ", año: "+getYear());
    }

    // añadir método tomar fotos

    @Override
    public void tomarFoto() {
        System.out.println("Guardando foto");
    }
}
