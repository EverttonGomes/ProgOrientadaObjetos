public class Caminhoes extends Veiculo {
	
	private double capacidadeDeCarga;

	public Caminhoes(String nome, int anoDeFabricacao, String cor, double precoDeCompra, int quantidadeEmEstoque, double capacidadeDeCarga) {
		super(nome, anoDeFabricacao, cor, precoDeCompra, quantidadeEmEstoque);
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	@Override
	public double calculoPrecoDeVenda() {
		if(capacidadeDeCarga >= 3000) {
			return precoDeCompra * 1.07;
		}else {
			return precoDeCompra * 1.05;
		}
	}

	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

}