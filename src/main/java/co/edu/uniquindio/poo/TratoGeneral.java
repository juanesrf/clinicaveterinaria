package co.edu.uniquindio.poo;

class TratoGeneral extends Trato {
    public TratoGeneral(String descripcion){
        super(descripcion);
    }
    @Override
    public void aplicarTrato(Animal animal) {
        System.out.println("Tratando al animal de forma general.");
        animal.emitirSonido();
        animal.comer();
        animal.dormir();
    }
}
