package projeto_veiculos;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", "amarelo", "Diesel", 2021, 50);
        Moto moto = new Moto("Honda", "CBR500R", "verde", "Gasolina", 2022, 70);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", "azul", "Etanol", 2020, 45);

        System.out.println("Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Gasolina: " + carro.getTipoCombustivel());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Potencia: " + carro.getPotencia());
        carro.ligar();
        carro.acelerar();
        carro.frear();
        
        System.out.println();

        System.out.println("Moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Gasolina: " + moto.getTipoCombustivel());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Potencia: " + moto.getPotencia());
        moto.acelerar();
        moto.frear();
        System.out.println();

        System.out.println("Caminhão:");
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Gasolina: " + caminhao.getTipoCombustivel());
        System.out.println("Ano: " + caminhao.getAno());
        System.out.println("Potencia: " + caminhao.getPotencia());
        caminhao.acelerar();
        
    }
}
       

