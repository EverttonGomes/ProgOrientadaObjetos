public abstract class Pcs implements Venda {

	private String placaMae;
	private String processador;
	private int memoria;
	protected double preco;
	
	public Pcs(String placaMae, String processador, int memoria, double preco) {
		super();
		this.placaMae = placaMae;
		this.processador = processador;
		this.memoria = memoria;
		this.preco = preco;
	}

	public String getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}