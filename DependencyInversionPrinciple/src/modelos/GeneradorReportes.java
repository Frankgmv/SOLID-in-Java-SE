package modelos;

import interfaces.Generador;

public class GeneradorReportes {

    // Llavar la interface contiene los 2 generadores
    Generador generador;

    public GeneradorReportes(Generador generador) {
        this.generador = generador;
    }

    // generar el reporte de la independencia
    public void generanarReporte() {
        generador.generarReporte();
    }
}
