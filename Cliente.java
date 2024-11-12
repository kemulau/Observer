public class Cliente {
    public static void main(String[] args) {
        Dragao dragao = new Dragao();

        Cavaleiro cavaleiro = new Cavaleiro();
        Mago mago = new Mago();

        dragao.adicionarAventureiro(cavaleiro);
        dragao.adicionarAventureiro(mago);

        System.out.println("O Dragão acordou!");
        dragao.alterarHumor("sonolento");

        System.out.println("\nO Dragão ficou bravo!");
        dragao.alterarHumor("bravo");

        System.out.println("\nO Dragão voltou a dormir...");
        dragao.alterarHumor("dormindo");
    }
}
