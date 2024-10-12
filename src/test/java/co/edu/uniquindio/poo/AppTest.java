/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    // Prueba para verificar la correcta instanciación de Perro
    @Test
    public void testPerroInstantiation() {
        Perro perro = new Perro("Rex", 4, 10, false, false, Ambiente.Domestico, "Pastor Aleman");
        assertEquals("Rex", perro.getNombre());
        assertEquals(4, perro.getEdad());
        assertEquals(10, perro.getPeso());
        assertFalse(perro.isPuedeCazar());
        assertFalse(perro.isPuedeVolar());
    }

    // Prueba para verificar la correcta instanciación de Gato
    @Test
    public void testGatoInstantiation() {
        Gato gato = new Gato("misifu", 4, 6, false, false, Ambiente.Domestico, "cafe");
        assertEquals("misifu", gato.getNombre());
        assertEquals(4, gato.getEdad());
        assertEquals(6, gato.getPeso());
        assertFalse(gato.isPuedeVolar());
        assertFalse(gato.isPuedeCazar());
    }

    // Prueba para verificar la correcta instanciación de León
    @Test
    public void testFelinoInstantiation() {
        Felino felino = new Felino("Simba", 8, 70, true, false, Ambiente.Salvaje, "león", true);
        assertEquals("Simba", felino.getNombre());
        assertEquals(8, felino.getEdad());
        assertEquals(70.0, felino.getPeso());
        assertFalse(felino.isPuedeVolar());
        assertTrue(felino.isPuedeCazar());
    }

    // Prueba para verificar la correcta instanciación de Águila
    @Test
    public void testAveInstantiation() {
        Ave aguila = new Ave("doroti", 3, 30, true, true, null, null);
        assertEquals("doroti", aguila.getNombre());
        assertEquals(3, aguila.getEdad());
        assertEquals(30, aguila.getPeso());
        assertTrue(aguila.isPuedeVolar());
        assertTrue(aguila.isPuedeCazar());
    }



    @Test
    public void testPerroEmitirSonido() {
        Perro perro = new Perro("Rex", 4, 10, false, false, Ambiente.Domestico, "Pastor Aleman");
        assertDoesNotThrow(() -> perro.emitirSonido(), "El método emitirSonido del perro no debe lanzar excepciones");
    }

    @Test
    public void testGatoEmitirSonido() {
        Gato gato = new Gato("misifu", 4, 6, false, false, Ambiente.Domestico, "cafe");
        assertDoesNotThrow(() -> gato.emitirSonido(), "El método emitirSonido del gato no debe lanzar excepciones");
    }

    @Test
    public void testFelinoEmitirSonido() {
        Felino felino = new Felino("Simba", 8, 70, true, false, Ambiente.Salvaje, "león", true);
        assertDoesNotThrow(() -> felino.emitirSonido(), "El método emitirSonido del león no debe lanzar excepciones");
    }

    @Test
    public void testAveEmitirSonido() {
        Ave aguila = new Ave("doroti", 3, 30, true, true, null, null);
        assertDoesNotThrow(() -> aguila.emitirSonido(), "El método emitirSonido del águila no debe lanzar excepciones");
    }

    @Test
    public void testTratamientoGeneral() {
        Perro perro = new Perro("Rex", 4, 10, false, false, Ambiente.Domestico, "Pastor Aleman");
        Veterinaria veterinaria = new Veterinaria("patitas al rescate", "guaduales", null, null, null);
        assertDoesNotThrow(() -> veterinaria.tratarAnimal(perro), "El método tratarAnimal no debe lanzar excepciones para animales normales");
    }

    @Test
    public void testTratamientoCazador() {
        Felino felino = new Felino("Simba", 8, 70, true, false, Ambiente.Salvaje, "león", true);
        Veterinaria veterinaria = new Veterinaria("patitas al rescate", "guaduales", null, null, null);

        assertDoesNotThrow(() -> veterinaria.tratarAnimal(felino), "El método tratarAnimal no debe lanzar excepciones para animales cazadores");
    }

    @Test
    public void testTratamientoVoladorCazador() {
        Ave aguila = new Ave("doroti", 3, 30, true, true, Ambiente.Salvaje, "Aguila");
        Veterinaria veterinaria = new Veterinaria("patitas al rescate", "guaduales", null, null, null);

        assertDoesNotThrow(() -> veterinaria.tratarAnimal(aguila), "El método tratarAnimal no debe lanzar excepciones para animales voladores y cazadores");
    }

    @Test
    public void testTratamientoVolador(){
        Ave colibri = new Ave("jose", 3, 30, false, true, Ambiente.Domestico, null);
        Veterinaria veterinaria = new Veterinaria("patitas al rescate", "guaduales", null, null, null);

        assertDoesNotThrow(() -> veterinaria.tratarAnimal(colibri), "El método tratarAnimal no debe lanzar excepciones para animales voladores");
    }

    @Test
    public void testTratamientoGeneralGato() {
        Gato gato = new Gato("misifu", 5, 10, false, false, Ambiente.Domestico, "negro");
        Veterinaria veterinaria = new Veterinaria("patitas al rescate", "guaduales", null, null, null);

        assertDoesNotThrow(() -> veterinaria.tratarAnimal(gato), "El método tratarAnimal no debe lanzar excepciones para gatos");
    }

}

