package padroesestruturais.flyweight;

public class Arvore {

    private String nome;
    private String especie;
    private float altura;
    private Floresta localizacao;

    public Arvore(String nome, String especie, float altura, Floresta localizacao) {
        this.nome = nome;
        this.especie = especie;
        this.localizacao = localizacao;
        this.altura = altura;
    }

    public String obterArvore() {
        return "Arvore{" +
                "nomeArvore='" + this.nome + '\'' +
                ", nomeEspecie='" + this.especie + '\'' +
                ", Altura='" + this.altura + '\'' +
                ", nomeFloresta='" + localizacao.getNome() + '\'' +
                ", tipo='" + localizacao.getTipo() + '\'' +
                '}';
    }
}
