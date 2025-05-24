public class Carro {
    private String modelo;
    private String motor;
    private String cor;
    private String transmissao;

    // Construtor privado - só o Builder pode criar
    private Carro() {}

    // Getters
    public String getModelo() { return modelo; }
    public String getMotor() { return motor; }
    public String getCor() { return cor; }
    public String getTransmissao() { return transmissao; }

    // Exibe as especificações do carro
    public void mostrarEspecificacoes() {
        System.out.println("Carro: modelo=" + modelo + ", motor=" + motor + 
                          ", cor=" + cor + ", transmissão=" + transmissao);
    }

    // Classe Builder interna
    public static class Builder {
        private Carro carro;

        public Builder() {
            carro = new Carro();
        }

        public Builder comModelo(String modelo) {
            carro.modelo = modelo;
            return this;
        }

        public Builder comMotor(String motor) {
            carro.motor = motor;
            return this;
        }

        public Builder comCor(String cor) {
            carro.cor = cor;
            return this;
        }

        public Builder comTransmissao(String transmissao) {
            carro.transmissao = transmissao;
            return this;
        }

        public Carro build() {
            return carro;
        }
    }
}
