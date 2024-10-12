package co.edu.uniquindio.poo;

class TratoCazador extends Trato {
    public TratoCazador(String descripcion){
        super(descripcion);
    }
    @Override
    public void aplicarTrato(Animal animal) {
        System.out.println("Tratando al animal cazador.");
        animal.emitirSonido();
        System.out.println("Requiere control especial por su comportamiento de caza.");
        if(animal instanceof Felino){
            Felino felino = (Felino) animal;
            if (felino.isMelena() == true){
                System.out.println("Requiere cuidado con su melena");
            }
        }
        animal.comer();
        animal.dormir();
    }
}
