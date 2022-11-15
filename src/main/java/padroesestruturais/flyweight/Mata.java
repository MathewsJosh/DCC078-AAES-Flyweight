package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Mata {

    private List<Arvore> arvores = new ArrayList<>();

    public void reflorestamento(String nomeArvore, String nomeEspecie, float Altura, String nomeFloresta, String tipo) {
        Floresta floresta = FlorestaFactory.getFloresta(nomeFloresta, tipo);
        Arvore arvore = new Arvore(nomeArvore, nomeEspecie, Altura, floresta);
        arvores.add(arvore);
    }

    public List<String> obterArvores() {
        List<String> saida = new ArrayList<String>();
        for (Arvore arvore : this.arvores) {
            saida.add(arvore.obterArvore());
        }
        return saida;
    }


}
