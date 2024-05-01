public class Veiculo {
    public String veiculo;
    public String marca;
    public String modelo;
    public int ano;
    public int velocidadeMaxima;
    public int velocidadeAtual;
    public boolean power;

    public void ligar(boolean ligar) {
        if (ligar){
            System.out.println("Veiculo ligado.");
        } else {
            System.out.println("Veiculo desligado.");
        }
        this.power = ligar;
    }

    public void acelerar(int incremento) {
        if (incremento < 0) {
            System.out.println("Valor invalido");
        } else {
            if (power){
                this.velocidadeAtual += incremento;
                obterStatus();
            } else {
                System.out.println("Não é possivel aumentar a velocidade ligue o carro primeiro!.");
            }
        }
    }

    public void reduzirVelocidade(int decremento) {
        if (decremento < 0) {
            System.out.println("Valor inválido.");
        } else {
            if (power){
                if (decremento > velocidadeAtual) {
                    velocidadeAtual = 0;
                    obterStatus();
                } else {
                    this.velocidadeAtual -= decremento;
                }
            } else {
                System.out.println("Não é possivel reduzir a velocidade ligue o carro primeiro!.");
            }
        }
    }

    public void obterStatus() {
            System.out.println("\n╔═════════════════════════════╗");
            System.out.println("║           Status            ║");
            System.out.println("╟─────────────────────────────╢");
            System.out.println("║ Veiculo: " + veiculo);
            System.out.println("║ Marca: " + marca);
            System.out.println("║ Modelo: " + modelo);
            System.out.println("║ Ano: " + ano);
            System.out.println("║ Velocidade máxima: " + velocidadeMaxima + " km/h");
            System.out.println("║ Velocidade atual: " + velocidadeAtual + " km/h");
            System.out.println("╚═════════════════════════════╝\n");
    }
}