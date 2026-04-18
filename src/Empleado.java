import java.util.Scanner;
public class Empleado {
    String nombre;
    double horas;
    double pagoHora;
    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese horas trabajadas: ");
        horas = sc.nextDouble();
        System.out.print("Ingrese pago por hora: ");
        pagoHora = sc.nextDouble();
    }
    public double calcularSueldoBase() {
        return horas * pagoHora;
    }
    public double calcularBono() {
        double sueldoBase = calcularSueldoBase();
        if (sueldoBase >= 480) {
            return 20;
        } else {
            return 0;
        }
    }
    public double calcularSueldoFinal() {
        return calcularSueldoBase() + calcularBono();
    }
    public void mostrarReporte() {
        System.out.println("\n----------- REPORTE DE EMPLEADO -----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + calcularSueldoBase());
        System.out.println("Bono: " + calcularBono());
        System.out.println("Sueldo final: " + calcularSueldoFinal());
        System.out.println("-------------------------------------------");
    }
}
