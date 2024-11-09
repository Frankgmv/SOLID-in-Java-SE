package modelos;

import interfaces.Generador;

// implementar el Generador para que se implementado por el generadorReportes.
public class CSVGenerador implements Generador {
    // Metodo propio para generar.
    @Override
    public void generarReporte() {
        System.out.println("Generar Reporte CSV");
    }
}
