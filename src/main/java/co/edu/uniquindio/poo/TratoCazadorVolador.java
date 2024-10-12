package co.edu.uniquindio.poo;

class TratoCazadorVolador extends Trato {
    public TratoCazadorVolador(String descripcion){
        super(descripcion);
    }
    @Override
    public void aplicarTrato(Animal animal) {
        System.out.println("Tratando al animal volador y cazador.");
        animal.emitirSonido();
        System.out.println("Requiere cuidados especiales tanto por sus habilidades de vuelo como de caza.");
        animal.comer();
        animal.dormir();
    }
}
