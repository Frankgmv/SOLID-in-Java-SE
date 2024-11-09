import modelos.CSVGenerador;
import modelos.GeneradorReportes;
import modelos.PDFGenerardo;

public class Main {
    public static void main(String[] args) {
        //Instanciar el generador e inyectar la dependencia que quiero que lleve
        GeneradorReportes generadorReportesCSV = new GeneradorReportes(new CSVGenerador());
        GeneradorReportes generadorReportesPDF = new GeneradorReportes(new PDFGenerardo());

        // Llemar los reportes de cada uno
        generadorReportesPDF.generanarReporte();
        generadorReportesCSV.generanarReporte();
    }
}