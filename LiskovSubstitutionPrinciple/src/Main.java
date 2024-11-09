import models.MotoAcuatica;
import models.MotoOffroad;

public class Main {
    public static void main(String[] args) {

        MotoAcuatica motoAcuatica = new MotoAcuatica();

        MotoOffroad motoOffroad = new MotoOffroad();

        motoAcuatica.encenderMoto();
        motoAcuatica.avanzar();
        motoAcuatica.saltarOlas();

        System.out.println("");


        motoOffroad.encenderMoto();
        motoOffroad.avanzar();
        motoOffroad.picarMoto();
        motoOffroad.mostrarVelocidad();

    }
}