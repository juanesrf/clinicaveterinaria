package co.edu.uniquindio.poo;

public class Ave extends Animal{
    private String raza;

    public Ave(String nombre, int edad, int peso, boolean puedeCazar, boolean puedeVolar,
            Ambiente ambiente, String raza) {
        super(nombre, edad, peso, puedeCazar, puedeVolar, ambiente);
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
        System.out.println(getNombre() + " está cantando.");
    }

    @Override
    public String toString() {
        return "Ave [getRaza()=" + getRaza() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
                + ", getPeso()=" + getPeso() + ", isPuedeCazar()=" + isPuedeCazar() + ", isPuedeVolar()="
                + isPuedeVolar() + ", getAmbiente()=" + getAmbiente() + "]";
    }

    
}
