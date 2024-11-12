import java.util.ArrayList;
import java.util.List;

public class Dragao {
    private List<Observador> aventureiros = new ArrayList<>();
    private String humor;

    public void adicionarAventureiro(Observador aventureiro) {
        aventureiros.add(aventureiro);
    }

    public void removerAventureiro(Observador aventureiro) {
        aventureiros.remove(aventureiro);
    }

    public void alterarHumor(String novoHumor) {
        this.humor = novoHumor;
        notificarAventureiros();
    }

    private void notificarAventureiros() {
        for (Observador aventureiro : aventureiros) {
            aventureiro.atualizarHumor(humor);
        }
    }
}
