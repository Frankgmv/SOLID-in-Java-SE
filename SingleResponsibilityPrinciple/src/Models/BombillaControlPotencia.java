package Models;

public class BombillaControlPotencia {
    private int potencia;

    public BombillaControlPotencia() {
    }

    public BombillaControlPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public  void cambiarPotencia (int potencia){
        if(potencia > 0 && potencia <= 100){
            String mesage = (this.potencia > potencia) ? "Disminuyendo": "Aumentando";
            System.out.println(mesage + " potencia a " + potencia);
            setPotencia(potencia);
        }else{
            System.out.println("Valor no válido en potencia");
        }
    }

}
