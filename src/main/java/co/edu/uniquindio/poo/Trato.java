package co.edu.uniquindio.poo;

public abstract class Trato {
    private String descripcion;

    public Trato(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void aplicarTrato(Animal animal);
}
