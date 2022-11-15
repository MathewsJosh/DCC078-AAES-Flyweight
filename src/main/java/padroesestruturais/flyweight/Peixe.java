package padroesestruturais.flyweight;

public class Peixe {

    private String nome;
    private Floresta localizacao;

    public Peixe(String nome, Floresta localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String obterPeixe() {
        return "Peixe{" +
                "nomePeixe='" + this.nome + '\'' +
                ", nomeFloresta='" + localizacao.getNome() + '\'' +
                ", tipo='" + localizacao.getTipo() + '\'' +
                '}';
    }
}
