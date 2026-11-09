public abstract class EvaluacionAcademica {
    private String nombreMateria;

    public EvaluacionAcademica(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void imprimirEncabezado() {
        System.out.println("========================================");
        System.out.println("Evaluación Académica: " + nombreMateria);
        System.out.println("========================================");
    }

    public abstract double calcularNotaFinal();
}