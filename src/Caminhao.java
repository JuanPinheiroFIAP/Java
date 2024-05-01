public class Caminhao extends Veiculo {
    public static final double capacidadeMaximaCarga = 1000;

    public void carregarCarga(int pesoCarga) {
        if (pesoCarga < 0) {
            System.out.println("Valor inválido para peso de carga.");
        } else {
            if (pesoCarga > capacidadeMaximaCarga) {
                System.out.println("Seu caminhão está muito pesado!");
            } else {
                System.out.println("Seu caminhão está com o peso adequado.");
            }
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