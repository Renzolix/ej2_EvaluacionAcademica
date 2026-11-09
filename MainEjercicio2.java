public class MainEjercicio2 {
    public static void main(String[] args) {
        ExamenParcial parcial = new ExamenParcial("Programación Orientada a Objetos", 8.5, 9.0);
        TrabajoPracticoIntegrador tpi = new TrabajoPracticoIntegrador("Bases de Datos Avanzadas", 9.0, 7.5, 0.40);

        parcial.imprimirEncabezado();
        System.out.println("Nota Final Examen Parcial: " + parcial.calcularNotaFinal() + "\n");

        tpi.imprimirEncabezado();
        System.out.println("Nota Final TP Integrador: " + String.format("%.2f", tpi.calcularNotaFinal()));
    }
}