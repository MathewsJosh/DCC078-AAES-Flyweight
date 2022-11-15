package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlorestaFactory {
    private static Map<String, Floresta> florestas = new HashMap<>();

    public static Floresta getFloresta(String nome, String tipo) {
        Floresta floresta = florestas.get(nome);
        if (floresta == null) {
            floresta = new Floresta(nome, tipo);
            florestas.put(nome, floresta);
        }
        return floresta;
    }

    public static int getTotalFlorestas() {
        return florestas.size();
    }

}




