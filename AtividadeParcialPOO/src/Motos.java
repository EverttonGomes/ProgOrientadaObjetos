public class Motos extends Veiculo {
	
	private String tipo;
	
	public Motos(String nome, int anoDeFabricacao, String cor, double precoDeCompra, int quantidadeEmEstoque, String tipo) {
		super(nome, anoDeFabricacao, cor, precoDeCompra, quantidadeEmEstoque);
		this.tipo = tipo;
	}

	@Override
	public double calculoPrecoDeVenda() {
		if(tipo == "Esportiva" && cor == "Verde" || cor == "Vermelha") {
			return precoDeCompra * 1.4;
		}else {
			return precoDeCompra * 1.10;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}