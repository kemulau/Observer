public class Mago implements Observador {
    @Override
    public void atualizarHumor(String humor) {
        if (humor.equals("bravo")) {
            System.out.println("Mago: O dragão está bravo! Preparando feitiço de proteção!");
        } else if (humor.equals("sonolento")) {
            System.out.println("Mago: O dragão está sonolento... Hora de estudar novos feitiços em paz.");
        } else {
            System.out.println("Mago: Observando o dragão...");
        }
    }
}
