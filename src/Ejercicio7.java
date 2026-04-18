public class Ejercicio7 {
    public static void main(String[] args) {
        InventarioProducto p = new InventarioProducto("PRD-105","Disco SSD 1TB","Almacenamiento",89.50, 12, 8);
        p.setPrecio(95.00);
        p.setStock(5);
        p.setStock(-3);
        p.mostrarReporte();
    }
}
