    class Carro extends Veiculo {
    private int velocidadeMaxima;
    private boolean arCondicionado;

    public void ligarCarro() {
        ligar(true); // Ligar o carro (seta power como true)
    }

    public void desligarCarro() {
        ligar(false); // Desligar o carro (seta power como false)
    }

    public void ligarArCondicionad(){
        if (power){
            arCondicionado = true;
            System.out.println("Ar ligado!");
        } else {
            System.out.println("O carro precisa estár ligado!.");
        }
    }

    public void desligarArCondicionado(){
        arCondicionado = false;
        System.out.println("O ar foi desligado!.");
    }

    public void setVelocidadeMaxima(int velocidadeMaxima ) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}