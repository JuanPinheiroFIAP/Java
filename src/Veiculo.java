public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public int velocidadeMaxima;
    public int velocidadeAtual;
    public boolean power;

    public void ligar(boolean ligar) {
        if (ligar){
            System.out.println("ligado.");
        } else {
            System.out.println("desligado.");
        }
        this.power = ligar;
    }

    public void acelerar(int incremento) {
        if (power){
            this.velocidadeAtual += incremento;
        } else {
            System.out.println("Ligue o carro primeiro!.");
        }
    }

    public void reduzirVelocidade(int decremento) {
        if (power){
            this.velocidadeAtual -= decremento;
        } else {
            System.out.println("Ligue o carro primeiro!.");
        }
    }

    public void obterStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }
}