package ejercicios_get_set;

// EJERCICIO 10 — Gestión de un Producto en Tienda Online
public class ProductoDigital {

    private String nombre;
    private double precio;
    private int stock;

    // Constructor: usa los setters para validar precio y stock
    public ProductoDigital(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    public String getNombre() {
        return nombre;
    }

    // ----- Getters y setters de precio y stock (deben ser positivos) -----
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio inválido para " + nombre + " (" + precio + "). Debe ser positivo.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock > 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock inválido para " + nombre + " (" + stock + "). Debe ser positivo.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " unidades");
    }
}
