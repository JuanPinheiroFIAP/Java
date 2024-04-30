class Caminhao extends Veiculo{
    private int velocidadeMaxima;
    public static final double capacidadeMaximaCarga = 1000;

    public void carregarCarga(int pesoCarga) {
        if (pesoCarga > capacidadeMaximaCarga){
            System.out.println("Seu caminhão está muito pesado!");
        } else {
            System.out.println("Seu caminhão está com o peso adequado.");
        }
    }

    public void setVelocidadeMaxima(int velocidadeMaxima ) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
