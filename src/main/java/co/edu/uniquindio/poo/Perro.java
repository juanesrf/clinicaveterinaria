package co.edu.uniquindio.poo;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, int edad, int peso, boolean puedeCazar, boolean puedeVolar,
            Ambiente ambiente, String raza) {
        super(nombre, edad, peso, false, false,  ambiente);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " está ladrando.");
    }

    @Override
    public String toString() {
        return "Perro [getRaza()=" + getRaza() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getPeso()=" + getPeso() + ", isPuedeCazar()=" + isPuedeCazar() + ", isPuedeVolar()="
                + isPuedeVolar() + ", getAmbiente()=" + getAmbiente() + "]";
    }

    
}
