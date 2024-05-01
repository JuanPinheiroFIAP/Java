public class Carro extends Veiculo {
    private boolean arCondicionado;

    public void ligarArCondicionado() {
        if (power) {
            arCondicionado = true;
            System.out.println("Ar condicionado ligado!");
        } else {
            System.out.println("O carro precisa estar ligado para ligar o ar condicionado.");
        }
    }

    public void desligarArCondicionado() {
        if (!arCondicionado) {
            System.out.println("O ar condicionado já está desligado!");
        } else {
            arCondicionado = false;
            System.out.println("O ar condicionado foi desligado.");
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