public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();

        //Criando os veículos
        carro.veiculo = "Carro";
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2022;
        carro.setVelocidadeMaxima(180);

        moto.veiculo = "Moto";
        moto.marca = "Honda";
        moto.modelo = "CB 500F";
        moto.ano = 2020;
        moto.setVelocidadeMaxima(200);

        caminhao.veiculo = "Caminhão";
        caminhao.marca = "Volvo";
        caminhao.modelo = "FH";
        caminhao.ano = 2019;
        caminhao.setVelocidadeMaxima(120);

        //Testando as funcionalidades dos veículos
        carro.ligar(true);
        carro.acelerar(50);
        carro.ligarArCondicionado();
        carro.reduzirVelocidade(20);
        carro.obterStatus();

        moto.ligar(true);
        moto.acelerar(70);
        moto.empinar();
        moto.reduzirVelocidade(10);
        moto.obterStatus();

        caminhao.ligar(true);
        caminhao.carregarCarga(6000);
        caminhao.setVelocidadeMaxima(100);
        caminhao.reduzirVelocidade(30);
        caminhao.obterStatus();
    }
}