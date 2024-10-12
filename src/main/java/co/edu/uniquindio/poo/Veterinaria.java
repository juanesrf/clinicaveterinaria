package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinaria {
    private String nombre;
    private String direcion;
    private LinkedList<Animal>animales;
    private LinkedList<Dueno>duenos;
    private LinkedList<Trato>tratos;


    public Veterinaria(String nombre, String direcion,LinkedList<Animal> animales, LinkedList<Dueno> duenos, LinkedList<Trato> tratos) {
        this.nombre = nombre;
        this.direcion = direcion;
        this.animales = new LinkedList<>();
        this.duenos = new LinkedList<>();
        this.tratos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public LinkedList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(LinkedList<Animal> animales) {
        this.animales = animales;
    }

    public LinkedList<Dueno> getDuenos() {
        return duenos;
    }

    public void setDuenos(LinkedList<Dueno> duenos) {
        this.duenos = duenos;
    }

    public LinkedList<Trato> getTratos() {
        return tratos;
    }

    public void setTratos(LinkedList<Trato> tratos) {
        this.tratos = tratos;
    }

    public void tratarAnimal(Animal animal) {
        Trato trato; // Instancia de la clase Trato

        // Verificar qué trato aplicar
        if (animal.isPuedeVolar() && animal.isPuedeCazar()) {
            trato = new TratoCazadorVolador("Tratamiento especializado en animales voladores que son cazadores");
        } else if (animal.isPuedeVolar()) {
            trato = new TratoVolador("Tratamiento espicializado en animales Voladores");
        } else if (animal.isPuedeCazar()) {
            trato = new TratoCazador("Tratamoiento especializado para animales cazadores");
        } else {
            trato = new TratoGeneral("Tratamiento básico");
        }

        // Aplicar el trato correspondiente
        trato.aplicarTrato(animal);
    }

    public boolean agregarAnimalDueno(Dueno dueno, Animal animal){
        boolean anadido = false;
        for (Dueno dueno2 : duenos) {
            // busca dentro de la clase Grupo el grupoAux dentro de la lista de grupos
            if(dueno2.equals(dueno)){
                    //añade el contacto a la lista de contactos del grupo
                dueno2.getAnimales().add(animal);
                anadido = true;
                break;
            }
        }
        return anadido;
    }

}
    

