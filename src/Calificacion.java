import java.util.Scanner;
public class Calificacion {
    String nombre;
    double nota1, nota2, nota3;
    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Ingrese nota 2: ");
        nota2 = sc.nextDouble();
        System.out.print("Ingrese nota 3: ");
        nota3 = sc.nextDouble();
    }
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
    public String obtenerEstado() {
        double promedio = calcularPromedio();
        if (promedio >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
    public void mostrarReporte() {
        System.out.println("\n-------- REPORTE ACADÉMICO --------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio final: " + calcularPromedio());
        System.out.println("Estado: " + obtenerEstado());
        System.out.println("-----------------------------------");
    }
}
