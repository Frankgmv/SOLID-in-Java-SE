package Models;

public class BombillaControlColor {
    private String color;

    public BombillaControlColor(String color) {
        this.color = color;
    }

    public BombillaControlColor() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void cambiarColor (String color){
        System.out.println("Cambiando color de "+getColor()+" a "+color);
        setColor(color);
    }
}
