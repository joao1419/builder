public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro.Builder()
            .comModelo("Sedan")
            .comMotor("2.0 Turbo")
            .comCor("Preto")
            .comTransmissao("Automática")
            .build();
        
        meuCarro.mostrarEspecificacoes();
        // Saída: Carro: modelo=Sedan, motor=2.0 Turbo, cor=Preto, transmissão=Automática
    }
}
