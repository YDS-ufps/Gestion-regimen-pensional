
/**
 * Write a description of class Rais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rais extends RegimenPensional {
    @Override
    public double calcularPension(Trabajador trabajador, int semanasCotizadas, double saldoAcumulado) {
        int expectativaVida = 240; // 20 años * 12 meses (Simplificación)
        return saldoAcumulado / expectativaVida;
    }

    @Override
    public double calcularAporte(double salario) {
        return salario * 0.16;
    }
}
