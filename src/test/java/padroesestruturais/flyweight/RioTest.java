package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RioTest {

    @Test
    void deveRetornarPeixes() {
        Rio rio = new Rio();
        rio.aumentarPopulacao("Dourado", "Vale Do Jequitinhonha", "Mata Equatorial");
        rio.aumentarPopulacao("Tilápia", "Mata do Kram beck", "Mata Atlântica");
        rio.aumentarPopulacao("Bagre", "Jardim Botânico", "Cerrado");
        rio.aumentarPopulacao("Cascao", "Mata do Mangabal", "Agreste");

        List<String> saida = Arrays.asList(
                "Peixe{nomePeixe='Dourado', nomeFloresta='Vale Do Jequitinhonha', tipo='Mata Equatorial'}",
                "Peixe{nomePeixe='Tilápia', nomeFloresta='Mata do Kram beck', tipo='Mata Atlântica'}",
                "Peixe{nomePeixe='Bagre', nomeFloresta='Jardim Botânico', tipo='Cerrado'}",
                "Peixe{nomePeixe='Cascao', nomeFloresta='Mata do Mangabal', tipo='Agreste'}");

        assertEquals(saida, rio.obterPeixes());
    }

    @Test
    void deveRetornarTotalFlorestas() {
        Rio rio = new Rio();
        rio.aumentarPopulacao("Dourado", "Vale Do Jequitinhonha", "Mata Equatorial");
        rio.aumentarPopulacao("Tilápia", "Mata do Kram beck", "Mata Atlântica");
        rio.aumentarPopulacao("Bagre", "Jardim Botânico", "Cerrado");
        rio.aumentarPopulacao("Cascao", "Mata do Mangabal", "Agreste");

        assertEquals(4, FlorestaFactory.getTotalFlorestas());
    }

}