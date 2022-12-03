public class Pc extends Pcs {
	
	private int hd;

	public Pc(String placaMae, String processador, int memoria, double preco, int hd) {
		super(placaMae, processador, memoria, preco);
		this.hd = hd;
	}

	public int getHd() {
		return hd;
	}

	public void setHd(int hd) {
		this.hd = hd;
	}

	@Override
	public double precoDeVenda() {
		
		return preco * 0.05;
	}

	@Override
	public double cashback() {
		
		return preco * 0.01;
	}
	
}