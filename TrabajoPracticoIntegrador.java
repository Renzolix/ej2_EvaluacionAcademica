public class TrabajoPracticoIntegrador extends EvaluacionAcademica {
    private double notaEntrega;
    private double notaExposicion;
    private double ponderacionExpo; // Ej: 0.40 para 40%

    public TrabajoPracticoIntegrador(String nombreMateria, double notaEntrega, double notaExposicion, double ponderacionExpo) {
        super(nombreMateria);
        this.notaEntrega = notaEntrega;
        this.notaExposicion = notaExposicion;
        this.ponderacionExpo = ponderacionExpo;
    }

    @Override
    public double calcularNotaFinal() {
        return (notaEntrega * (1.0 - ponderacionExpo)) + (notaExposicion * ponderacionExpo);
    }
}