import java.util.ArrayList;
/**
 * Write a description of class SistemaPensional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class SistemaPensional {
    private ArrayList<Trabajador> trabajadores;

    public SistemaPensional() {
        trabajadores = new ArrayList<>();
    }

    public void afiliarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    public void calcularAportesMensuales() {
        for (Trabajador trabajador : trabajadores) {
            double aporte = trabajador.getRegimenPensional().calcularAporte(trabajador.getSalario());
            System.out.println("Trabajador: " + trabajador.getNombre() + ", Aporte Mensual: " + aporte);
        }
    }

    public void simularPensiones() {
        for (Trabajador trabajador : trabajadores) {
            double pension = trabajador.getRegimenPensional().calcularPension(trabajador, 1300, 10000000); // Ejemplo de semanas cotizadas y saldo acumulado
            System.out.println("Trabajador: " + trabajador.getNombre() + ", Pensión Estimada: " + pension);
        }
    }
    
    
    public static void main(String[] args) {
        SistemaPensional sistema = new SistemaPensional();

        RegimenPensional rpm = new Rpm();
        RegimenPensional rais = new Rais();

        Trabajador trabajador1 = new Trabajador("Juan Perez", "12345678", "dependiente", 2000000, rpm);
        Trabajador trabajador2 = new Trabajador("Maria Gomez", "87654321", "independiente", 3000000, rais);

        sistema.afiliarTrabajador(trabajador1);
        sistema.afiliarTrabajador(trabajador2);

        sistema.calcularAportesMensuales();
        sistema.simularPensiones();
    }
    
}

