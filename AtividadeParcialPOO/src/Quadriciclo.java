public class Quadriciclo extends Veiculo {
	
	private int cilindrada;

	public Quadriciclo(String nome, int anoDeFabricacao, String cor, double precoDeCompra, int quantidadeEmEstoque, int cilindrada) {
		super(nome, anoDeFabricacao, cor, precoDeCompra, quantidadeEmEstoque);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public double calculoPrecoDeVenda() {
		if(cilindrada >= 300) {
			return precoDeCompra * 1.23;
		}else {
			return precoDeCompra * 1.18;
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}