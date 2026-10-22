package practicas_casa_s3;

// PRÁCTICA ND2.2 — PRODUCTO CON STOCK
public class Producto {

    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    // ----- Getters -----
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getCategoria() {
        return categoria;
    }

    // ----- Setters con validación -----
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre del producto no puede estar vacío.");
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: el precio no puede ser negativo (" + precio + ").");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: el stock no puede ser negativo (" + stock + ").");
        }
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Solo aumenta el stock si la cantidad es positiva
    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock = this.stock + cantidad;
            System.out.println("Stock aumentado en " + cantidad + ". Nuevo stock: " + this.stock);
        } else {
            System.out.println("Error: la cantidad a aumentar debe ser positiva (" + cantidad + ").");
        }
    }
}
