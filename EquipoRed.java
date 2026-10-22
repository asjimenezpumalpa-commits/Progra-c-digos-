package practicas_casa_s2;

// PRÁCTICA NT1.1 — EQUIPO DE RED
public class EquipoRed {

    // Atributos public
    public String nombre;
    public String direccionIP;

    // Atributos con acceso por defecto
    String tipo;
    boolean conectado;

    // ----- Métodos public -----
    public void conectar() {
        conectado = true;
        System.out.println(nombre + " se conectó a la red.");
    }

    public void mostrarInformacion() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Dirección IP: " + direccionIP);
        System.out.println("Tipo: " + tipo);
        System.out.println("Conectado: " + conectado);
    }

    // ----- Métodos con acceso por defecto -----
    void desconectar() {
        conectado = false;
        System.out.println(nombre + " se desconectó de la red.");
    }

    void mostrarEstado() {
        if (conectado) {
            System.out.println(nombre + " (" + direccionIP + ") -> CONECTADO");
        } else {
            System.out.println(nombre + " (" + direccionIP + ") -> DESCONECTADO");
        }
    }
}
