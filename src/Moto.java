public class Moto extends Veiculo {
    private boolean empinar;

    public void empinar() {
        if (velocidadeAtual >= 20 && velocidadeAtual <= 50) {
            System.out.println("Moto empinada!");
        } else {
            System.out.println("Sua velocidade para empinar não é adequada.");
        }
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima < 0) {
            System.out.println("Valor inválido para velocidade máxima.");
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }
}