package co.edu.uniquindio.poo;

public class Felino extends Animal{
    private String raza;
    private boolean melena;
   
    public Felino(String nombre, int edad, int peso, boolean puedeCazar, boolean puedeVolar, Ambiente ambiente,
            String raza, boolean melena) {
        super(nombre, edad, peso, true, false, ambiente);
        this.raza = raza;
        this.melena = melena;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public boolean isMelena() {
        return melena;
    }
    public void setMelena(boolean melena) {
        this.melena = melena;
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " está rugiendo.");
    }

    @Override
    public String toString() {
        return "Felino [getRaza()=" + getRaza() + ", isMelena()=" + isMelena() + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", isPuedeCazar()=" + isPuedeCazar()
                + ", isPuedeVolar()=" + isPuedeVolar() + ", getAmbiente()=" + getAmbiente() + "]";
    }

    
}
