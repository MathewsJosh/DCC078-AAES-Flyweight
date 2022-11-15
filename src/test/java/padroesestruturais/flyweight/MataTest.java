package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MataTest {

    @Test
    void deveRetornarArvores() {
        Mata mata = new Mata();
        mata.reflorestamento("Musgo", "Musguinho", 0.01f, "Vale Do Jequitinhonha","Mata Equatorial");
        mata.reflorestamento("Laranjeira", "Lala", 2.12f, "Mata Gal", "Cerrado");
        mata.reflorestamento("Macieira", "Massa", 3.5f, "Pomar das frutas", "Mata Atlântica");

        List<String> saida = Arrays.asList(
            "Arvore{nomeArvore='Musgo', nomeEspecie='Musguinho', Altura='0.01', nomeFloresta='Vale Do Jequitinhonha', tipo='Mata Equatorial'}",
            "Arvore{nomeArvore='Laranjeira', nomeEspecie='Lala', Altura='2.12', nomeFloresta='Mata Gal', tipo='Cerrado'}",
            "Arvore{nomeArvore='Macieira', nomeEspecie='Massa', Altura='3.5', nomeFloresta='Pomar das frutas', tipo='Mata Atlântica'}");

        assertEquals(saida, mata.obterArvores());
    }

    @Test
    void deveRetornarTotalMatas() {
        Mata mata = new Mata();
        mata.reflorestamento("Musgo", "Musguinho", 0.01f, "Vale Do Jequitinhonha","Mata Equatorial");
        mata.reflorestamento("Laranjeira", "Lala", 2f, "Mata Gal", "Cerrado");
        mata.reflorestamento("Macieira", "Massa", 3.5f, "Pomar das frutas", "Mata Atlântica");

        assertEquals(3, FlorestaFactory.getTotalFlorestas());
    }

}