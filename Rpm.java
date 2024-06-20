
/**
 * Write a description of class Rpm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rpm extends RegimenPensional {
    @Override
    public double calcularPension(Trabajador trabajador, int semanasCotizadas, double saldoAcumulado) {
        double ibl = calcularIBL(trabajador);
        double porcentajePension = calcularPorcentajePension(semanasCotizadas);
        return ibl * porcentajePension;
    }

    private double calcularIBL(Trabajador trabajador) {
        return trabajador.getSalario();
    }

    private double calcularPorcentajePension(int semanasCotizadas) {
        if (semanasCotizadas >= 1300) {
            int extraSemanas = semanasCotizadas - 1300;
            int bloques = extraSemanas / 50;
            double porcentaje = 0.65 + (bloques * 0.015);
            return Math.min(porcentaje, 0.8);
        } else {
            return 0.65;
        }
    }

    @Override
    public double calcularAporte(double salario) {
        return salario * 0.16;
    }
}
