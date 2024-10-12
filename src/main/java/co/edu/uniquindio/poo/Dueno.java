package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Dueno {
    private String nombre;
    private int cedula;
    private LinkedList<Animal>animales;
    
    public Dueno(String nombre, int cedula, LinkedList<Animal> animales) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.animales = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public LinkedList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(LinkedList<Animal> animales) {
        this.animales = animales;
    }


    
    
}
