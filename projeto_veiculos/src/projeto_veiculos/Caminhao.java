package projeto_veiculos;

public class Caminhao extends Veiculo {
    

    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
      
    }

   
    public void descarregar() {
        System.out.println("O caminhão está descarregando.");
    }

	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
}