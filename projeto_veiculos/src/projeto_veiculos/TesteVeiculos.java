package projeto_veiculos;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", "amarelo", 2021);
        Moto moto = new Moto("Honda", "CBR500R", "verde", 2022);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", "azul", 2020);

        System.out.println("Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Ano: " + carro.getAno());
        carro.acelerar();
        carro.frear();
        
        System.out.println();

        System.out.println("Moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Ano: " + moto.getAno());
        moto.acelerar();
        moto.frear();
        System.out.println();

        System.out.println("Caminhão:");
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Ano: " + caminhao.getAno());
        caminhao.acelerar();
        
    }
}
       

