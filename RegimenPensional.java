
/**
 * Write a description of class RegimenPensional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class RegimenPensional {
    public abstract double calcularPension(Trabajador trabajador, int semanasCotizadas, double saldoAcumulado);
    public abstract double calcularAporte(double salario);
}