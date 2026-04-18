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
            setPrecio(precio);
            setStock(stock);
            setStockMinimo(stockMinimo);
        }
        public void setPrecio(double precio) {
            if (precio > 0) {
                this.precio = precio;
                System.out.println("Precio actualizado correctamente");
            } else {
                System.out.println("Error: precio inválido");
            }
        }
        public void setStock(int stock) {
            if (stock >= 0) {
                this.stock = stock;
                System.out.println("Stock actualizado correctamente");
            } else {
                System.out.println("Error: stock no puede ser negativo");
            }
        }
        public void setStockMinimo(int stockMinimo) {
            if (stockMinimo >= 0) {
                this.stockMinimo = stockMinimo;
            } else {
                System.out.println("Error: stock mínimo inválido");
            }
        }
        public double getPrecio() { return precio; }
        public int getStock() { return stock; }
        public int getStockMinimo() { return stockMinimo; }
        public double calcularValorInventario() {
            return precio * stock;
        }
        public String estadoStock() {
            if (stock == 0) {
                return "Producto agotado";
            } else if (stock < stockMinimo) {
                return "Requiere reposición";
            } else {
                return "Stock suficiente";
            }
        }
        public void mostrarReporte() {
            System.out.println("\n------ REPORTE DE PRODUCTO ------");
            System.out.println("Código: " + codigo);
            System.out.println("Nombre: " + nombre);
            System.out.println("Categoría: " + categoria);
            System.out.println("Precio: " + precio);
            System.out.println("Stock: " + stock);
            System.out.println("Stock mínimo: " + stockMinimo);
            System.out.println("Valor inventario: " + calcularValorInventario());
            System.out.println("Estado: " + estadoStock());
            System.out.println("---------------------------------");
        }
}
