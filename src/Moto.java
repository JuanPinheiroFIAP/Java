class Moto extends Veiculo {
    private int velocidadeMaxima;
    private boolean empinar;

    public void empinar() {
        if (velocidadeAtual >= 20 && velocidadeAtual < 50){
            System.out.println("Moto empinada!");
        } else {
            System.out.println("Sua velocidade para empinar não é adequada.");
        }
    }

    public void setVelocidadeMaxima(int velocidadeMaxima ) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
