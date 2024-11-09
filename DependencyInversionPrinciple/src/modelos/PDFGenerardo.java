package modelos;

import interfaces.Generador;

/* llamar el generador para estandarizar el parametro de generador de reporte
 y lo resiva sin problema
*/
public class PDFGenerardo implements Generador {

    // implementar método generar para llamarlo en el generador reportes
    @Override
    public void generarReporte() {
        System.out.println("Generar Reporte PDF");
    }
}
