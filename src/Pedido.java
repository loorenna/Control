import java.util.Scanner;
public class Pedido {
    String cliente;
    String plato;
    double precio;
    int cantidad;
    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        cliente = sc.nextLine();

        System.out.print("Ingrese el plato: ");
        plato = sc.nextLine();

        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        cantidad = sc.nextInt();
    }
    public double calcularSubtotal() {
        return precio * cantidad;
    }
    public double calcularDescuento() {
        double subtotal = calcularSubtotal();

        if (subtotal > 25) {
            return subtotal * 0.10;
        } else {
            return 0;
        }
    }
    public double calcularTotalFinal() {
        return calcularSubtotal() - calcularDescuento();
    }
    public void mostrarCuenta() {
        System.out.println("\n------------- CUENTA DEL PEDIDO -------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Plato: " + plato);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Descuento: " + calcularDescuento());
        System.out.println("Total final: " + calcularTotalFinal());
    }
}
