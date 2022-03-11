package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro(12,"disel", "Azul", new Marca("Ford", "mais ou menos"));

        Carro carroClone = carro.clone();
        carroClone.setId(34);
        carroClone.getMarca().setDescricao("boa1");

        assertEquals("Carro{id=12, combustivel='disel', cor= 'Azul' marca=Marca{nome='Ford', descricao='mais ou menos'}", carro.toString());
        assertEquals("Carro{id=34, combustivel='disel', cor= 'Azul' marca=Marca{nome='Ford', descricao='boa1'}", carroClone.toString());
    }
}