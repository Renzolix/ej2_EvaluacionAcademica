public class ExamenParcial extends EvaluacionAcademica {
    private double notaTeoria;
    private double notaPractica;

    public ExamenParcial(String nombreMateria, double notaTeoria, double notaPractica) {
        super(nombreMateria);
        this.notaTeoria = notaTeoria;
        this.notaPractica = notaPractica;
    }

    @Override
    public double calcularNotaFinal() {
        return (notaTeoria + notaPractica) / 2.0;
    }
}