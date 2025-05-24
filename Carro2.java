public class Carro {
    // Atributos que representam as propriedades do objeto Carro
    private String modelo;
    private String motor;
    private String cor;
    private String transmissao;

    // Construtor privado para garantir que o objeto só seja criado pelo Builder
    private Carro() {}

    // Getters para acessar os atributos do objeto
    public String getModelo() { return modelo; }
    public String getMotor() { return motor; }
    public String getCor() { return cor; }
    public String getTransmissao() { return transmissao; }

    // Método para exibir as especificações do carro
    public void mostrarEspecificacoes() {
        System.out.println("Carro: modelo=" + modelo + ", motor=" + motor + 
                          ", cor=" + cor + ", transmissão=" + transmissao);
    }

    // Classe interna estática Builder, responsável pela construção passo a passo do objeto Carro
    public static class Builder {
        // Instância do objeto Carro sendo construído
        private Carro carro;

        // Construtor do Builder, inicializa um novo objeto Carro
        public Builder() {
            carro = new Carro();
        }

        // Método para configurar o modelo do carro, retorna o próprio Builder para encadeamento
        public Builder comModelo(String modelo) {
            carro.modelo = modelo;
            return this;
        }

        // Método para configurar o motor do carro, retorna o próprio Builder
        public Builder comMotor(String motor) {
            carro.motor = motor;
            return this;
        }

        // Método para configurar a cor do carro, retorna o próprio Builder
        public Builder comCor(String cor) {
            carro.cor = cor;
            return this;
        }

        // Método para configurar a transmissão do carro, retorna o próprio Builder
        public Builder comTransmissao(String transmissao) {
            carro.transmissao = transmissao;
            return this;
        }

        // Método que finaliza a construção e retorna o objeto Carro configurado
        public Carro build() {
            return carro;
        }
    }
}
