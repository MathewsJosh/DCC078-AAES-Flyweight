package padroesestruturais.flyweight;

public class Floresta {

    private String nome;
    private String tipo;

    public Floresta(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
