public class Carros extends Veiculo {
	
	private String tipo;
	
	public Carros(String nome, int anoDeFabricacao, String cor, double precoDeCompra, int quantidadeEmEstoque, String tipo) {
		super(nome, anoDeFabricacao, cor, precoDeCompra, quantidadeEmEstoque);
		this.tipo = tipo;
	}

	@Override
	public double calculoPrecoDeVenda() {
		if(anoDeFabricacao < 2018 && tipo == "Sedan") {
			return precoDeCompra * 1.3;
		}else {
			return precoDeCompra * 1.15;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}