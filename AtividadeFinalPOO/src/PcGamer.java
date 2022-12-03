public class PcGamer extends Pcs {
	
	private int ssd;
	private String placaDeVideo;

	public PcGamer(String placaMae, String processador, int memoria, double preco, String placaDeVideo, int ssd) {
		super(placaMae, processador, memoria, preco);
		this.ssd = ssd;
		this.placaDeVideo = placaDeVideo;
		
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public String getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

	@Override
	public double precoDeVenda() {
		
		return preco * 0.10;
	}

	@Override
	public double cashback() {
		
		return preco * 0.02;
	}

}