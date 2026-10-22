package ejercicios_get_set;

// EJERCICIO 2 — Clase RegistroIP y verificación de acceso
public class RegistroIP {

    private String direccionIP;
    private String horaAcceso;
    private boolean permitida;

    // Constructor que inicializa todos los atributos
    public RegistroIP(String direccionIP, String horaAcceso, boolean permitida) {
        this.direccionIP = direccionIP;
        this.horaAcceso = horaAcceso;
        this.permitida = permitida;
    }

    // ----- Getters y setters -----
    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getHoraAcceso() {
        return horaAcceso;
    }

    public void setHoraAcceso(String horaAcceso) {
        this.horaAcceso = horaAcceso;
    }

    public boolean getPermitida() {
        return permitida;
    }

    public void setPermitida(boolean permitida) {
        this.permitida = permitida;
    }

    // Indica si la IP tiene acceso permitido o no
    public void mostrarEstado() {
        if (permitida) {
            System.out.println("IP " + direccionIP + " (" + horaAcceso + ") -> ACCESO PERMITIDO");
        } else {
            System.out.println("IP " + direccionIP + " (" + horaAcceso + ") -> ACCESO DENEGADO");
        }
    }
}
