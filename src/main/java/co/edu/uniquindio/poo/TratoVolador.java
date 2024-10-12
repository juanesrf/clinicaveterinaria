package co.edu.uniquindio.poo;

class TratoVolador extends Trato {
    public TratoVolador(String descripcion){
        super(descripcion);
    }
    @Override
    public void aplicarTrato(Animal animal) {
        System.out.println("Tratando al animal volador.");
        animal.emitirSonido();
        System.out.println("Requiere cuidados especiales para sus alas.");
        animal.comer();
        animal.dormir();
    }
    
}