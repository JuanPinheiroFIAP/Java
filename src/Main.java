public class Main {
    public static void main(String[] args) {
        // Criar um novo objeto da classe Veiculo
        Veiculo meuVeiculo = new Veiculo();

        // Definir os atributos do veículo
        meuVeiculo.marca = "Ford";
        meuVeiculo.modelo = "Focus";
        meuVeiculo.ano = 2020;
        meuVeiculo.velocidadeMaxima = 200;
        meuVeiculo.velocidadeAtual = 0;



        meuVeiculo.acelerar();
        System.out.println("Velocidade atual após acelerar: " + meuVeiculo.velocidadeAtual);


    }
}
