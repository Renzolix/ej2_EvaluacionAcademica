# Ejercicio 2: EvaluacionAcademica

## Explicación Lógica
1. **Mezcla de Métodos:** `EvaluacionAcademica` ofrece una implementación concreta común (`imprimirEncabezado()`) y delega el cálculo cuantitativo mediante el método abstracto `calcularNotaFinal()`.
2. **Cálculos Especializados:** `ExamenParcial` calcula la nota promediando teoría y práctica, mientras que `TrabajoPracticoIntegrador` aplica una ponderación porcentual sobre la exposición oral y la entrega.