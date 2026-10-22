package practicas_casa_s2;

// PRÁCTICA NT1.2 — ENLACE DE COMUNICACIÓN
public class Enlace {

    // Atributos public
    public String nombre;
    public double velocidadMbps;

    // Atributos con acceso por defecto
    String origen;
    String destino;
    boolean activo;

    // ----- Métodos public -----
    public void activar() {
        activo = true;
        System.out.println("Enlace " + nombre + " activado.");
    }

    public void mostrarInformacion() {
        System.out.println("Enlace: " + nombre + " (" + origen + " -> " + destino + ")");
        System.out.println("Velocidad: " + velocidadMbps + " Mbps | Activo: " + activo);
    }

    // ----- Métodos con acceso por defecto -----
    void desactivar() {
        activo = false;
        System.out.println("Enlace " + nombre + " desactivado.");
    }

    void mostrarVelocidad() {
        System.out.println("Velocidad de " + nombre + ": " + velocidadMbps + " Mbps");
    }
}
