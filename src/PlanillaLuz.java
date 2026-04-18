import java.util.Scanner;
public class PlanillaLuz {
    String nombre;
    double consumo;
    double costoKW;
    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el consumo (kW): ");
        consumo = sc.nextDouble();
        System.out.print("Ingrese el costo por kW: ");
        costoKW = sc.nextDouble();
    }
    public double calcularSubtotal() {
        return consumo * costoKW;
    }
    public double calcularIVA() {
        return calcularSubtotal() * 0.15;
    }
    public double calcularTotal() {
        return calcularSubtotal() + calcularIVA();
    }
    public void mostrarPlanilla() {
        System.out.println("\n----------- PLANILLA DE LUZ -----------");
        System.out.println("Cliente: " + nombre);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("IVA: " + calcularIVA());
        System.out.println("Total a pagar: " + calcularTotal());
        System.out.println("---------------------------------------");
    }
}
