package practicas_casa_s2;

// PRÁCTICA ND1.3 — CUPÓN DE DESCUENTO
public class Cupon {

    // Atributos public
    public String codigo;
    public double porcentajeDescuento;

    // Atributos con acceso por defecto
    String descripcion;
    boolean activo;

    // ----- Métodos public -----
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Descuento: " + porcentajeDescuento + "%");
        System.out.println("Descripción: " + descripcion);
        System.out.println("Activo: " + activo);
    }

    public void activar() {
        activo = true;
    }

    // ----- Métodos con acceso por defecto -----
    void desactivar() {
        activo = false;
    }

    void mostrarDescuento() {
        System.out.println("El cupón " + codigo + " tiene " + porcentajeDescuento + "% de descuento.");
    }

    // Desafío: resumen en una sola línea
    void mostrarResumen() {
        System.out.println("Cupón " + codigo + " - Descuento " + (int) porcentajeDescuento + "%");
    }
}
