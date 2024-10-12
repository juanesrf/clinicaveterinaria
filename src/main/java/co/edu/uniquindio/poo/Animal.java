package co.edu.uniquindio.poo;

public abstract class Animal {

    private String nombre;
    private int edad;
    private int peso;
    private boolean puedeCazar;
    private boolean puedeVolar;
    private Ambiente ambiente;
    
    public Animal(String nombre, int edad, int peso, boolean puedeCazar, boolean puedeVolar, Ambiente ambiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.puedeCazar = puedeCazar;
        this.puedeVolar = puedeVolar;
        this.ambiente=ambiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isPuedeCazar() {
        return puedeCazar;
    }

    public void setPuedeCazar(boolean puedeCazar) {
        this.puedeCazar = puedeCazar;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }    

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public abstract void emitirSonido();

    

}
