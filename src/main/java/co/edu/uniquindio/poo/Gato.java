package co.edu.uniquindio.poo;

public class Gato extends Animal {
    private String color;    
    public Gato(String nombre, int edad, int peso, boolean puedeCazar, boolean puedeVolar, Ambiente ambiente,
            String color) {
        super(nombre, edad, peso, false, false, ambiente);
        this.color = color;
    }

    
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " está maullando.");
    }


    @Override
    public String toString() {
        return "Gato [getColor()=" + getColor() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getPeso()=" + getPeso() + ", isPuedeCazar()=" + isPuedeCazar() + ", isPuedeVolar()="
                + isPuedeVolar() + ", getAmbiente()=" + getAmbiente() + "]";
    }


    
    
}
