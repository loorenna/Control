import java.util.Scanner;
public class Producto {
    String nombre;
    double precio;
    int cantidad;
    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        cantidad = sc.nextInt();
    }
    public void mostrarFactura() {
        double total = precio * cantidad;
        double descuento = 0;
        if (total > 1000) {
            descuento = total * 0.10;
        }
        double totalPagar = total - descuento;
        System.out.println("\n----------- FACTURA -----------\n");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + total);
        System.out.println("Descuento: " + descuento);
        System.out.println("\nTotal a pagar: " + totalPagar);
    }
}
