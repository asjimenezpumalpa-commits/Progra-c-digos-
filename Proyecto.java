package practicas_casa_s3;

// PRÁCTICA SW2.2 — PROYECTO DE SOFTWARE
public class Proyecto {

    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    // ----- Getters -----
    public String getNombre() {
        return nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public String getResponsable() {
        return responsable;
    }

    public boolean getTerminado() {
        return terminado;
    }

    // ----- Setters con validación -----
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre del proyecto no puede estar vacío.");
        }
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            this.terminado = (progreso == 100);
        } else {
            System.out.println("Error: el progreso debe estar entre 0 y 100 (" + progreso + ").");
        }
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    // Avanza el proyecto sin pasar nunca de 100
    public void avanzar(int porcentaje) {
        if (porcentaje <= 0) {
            System.out.println("Error: el avance debe ser positivo (" + porcentaje + ").");
            return;
        }
        this.progreso = this.progreso + porcentaje;
        if (this.progreso >= 100) {
            this.progreso = 100;
            this.terminado = true;
        }
        System.out.println("Avance de " + porcentaje + "% -> progreso actual: " + this.progreso + "%");
    }
}
