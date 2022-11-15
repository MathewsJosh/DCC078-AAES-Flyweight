package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Rio {

    private List<Peixe> peixes = new ArrayList<>();

    public void aumentarPopulacao(String nomePeixe, String nomeFloresta, String tipo) {
        Floresta floresta = FlorestaFactory.getFloresta(nomeFloresta, tipo);
        Peixe peixe = new Peixe(nomePeixe, floresta);
        peixes.add(peixe);
    }

    public List<String> obterPeixes() {
        List<String> saida = new ArrayList<String>();
        for (Peixe peixe : this.peixes) {
            saida.add(peixe.obterPeixe());
        }
        return saida;
    }


}
