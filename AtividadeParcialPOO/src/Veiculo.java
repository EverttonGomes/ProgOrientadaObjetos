public abstract class Veiculo implements VendaDoSeguro {
	
	private String nome;
	protected int anoDeFabricacao;
	public String cor;
	protected double precoDeCompra;
	private int quantidadeEmEstoque;
	
	public Veiculo (String nome,int anoDeFabricacao,String cor,double precoDeCompra,int quantidadeEmEstoque) {
		this.nome = nome;
		this.anoDeFabricacao = anoDeFabricacao;
		this.cor = cor;
		this.precoDeCompra = precoDeCompra;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		
	}
	public abstract double calculoPrecoDeVenda();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPrecoDeCompra() {
		return precoDeCompra;
	}

	public void setPrecoDeCompra(double precoDeCompra) {
		this.precoDeCompra = precoDeCompra;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
}