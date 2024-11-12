public class Cavaleiro implements Observador {
    @Override
    public void atualizarHumor(String humor) {
        if (humor.equals("bravo")) {
            System.out.println("Cavaleiro: O dragão está bravo! Preparar escudo e espada!");
        } else if (humor.equals("sonolento")) {
            System.out.println("Cavaleiro: O dragão está sonolento... Vou me esconder para ele não me ver!");
        } else {
            System.out.println("Cavaleiro: Observando o dragão...");
        }
    }
}
