public class InventarioProducto {
    public String codigo;
    public String nombre;
    public String categoria;
    private double precio;
    private int stock;
    private int stockMinimo;
    public InventarioProducto(String codigo, String nombre, String categoria,double precio, int stock, int stockMinimo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: precio inválido");
        }
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: stock inválido");
        }
        if (stockMinimo >= 0) {
            this.stockMinimo = stockMinimo;
        } else {
            System.out.println("Error: stock mínimo inválido");
        }
    }
    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            precio = nuevoPrecio;
        } else {
            System.out.println("Error: precio no puede ser <= 0");
        }
    }
    public void actualizarStock(int nuevoStock) {
        if (nuevoStock >= 0) {
            stock = nuevoStock;
        } else {
            System.out.println("Error: stock no puede ser negativo");
        }
    }
    public void actualizarStockMinimo(int nuevoMinimo) {
        if (nuevoMinimo >= 0) {
            stockMinimo = nuevoMinimo;
        } else {
            System.out.println("Error: stock mínimo no puede ser negativo");
        }
    }
    public double calcularValorInventario() {
        return precio * stock;
    }
    public String evaluarEstado() {
        if (stock == 0) {
            return "Producto agotado";
        } else if (stock < stockMinimo) {
            return "Requiere reposición";
        } else {
            return "Stock suficiente";
        }
    }
    public void mostrarReporte() {
        System.out.println("\n--- REPORTE ---");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Stock mínimo: " + stockMinimo);
        System.out.println("Valor inventario: " + calcularValorInventario());
        System.out.println("Estado: " + evaluarEstado());
    }
}
