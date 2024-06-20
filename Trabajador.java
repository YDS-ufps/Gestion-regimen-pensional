
/**
 * Write a description of class Trabajador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trabajador extends Persona {
    private double salario;
    private RegimenPensional regimenPensional;

    public Trabajador(String nombre, String identificacion, String tipoTrabajador, double salario, RegimenPensional regimenPensional) {
        super(nombre, identificacion, tipoTrabajador);
        this.salario = salario;
        this.regimenPensional = regimenPensional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public RegimenPensional getRegimenPensional() {
        return regimenPensional;
    }

    public void setRegimenPensional(RegimenPensional regimenPensional) {
        this.regimenPensional = regimenPensional;
    }
}
