package projeto_veiculos;

public class Veiculo {

	private String marca, modelo, tipoCombustivel, cor;
	private int ano;
	private double potencia;

	public Veiculo(String marca, String modelo, String cor, String tipoCombustivel, int ano, double potencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.setTipoCombustivel(tipoCombustivel);
		this.ano = ano;
		this.setPotencia(potencia);
	
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia2) {
		this.potencia = potencia2;
	}

}