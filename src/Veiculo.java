public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public int velocidadeMaxima;
    public int velocidadeAtual;

    public void acelerar() {
        velocidadeAtual++;
    }


    public void reduzirVelocidade() {
        velocidadeAtual--;
    }

    public void obterStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }
}
