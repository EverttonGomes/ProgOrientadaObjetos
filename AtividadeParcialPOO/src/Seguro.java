public class Seguro implements VendaDoSeguro {
	
	private Veiculo veiculo;
	private String seguro;
	
	public Seguro(Veiculo veiculo, String seguro) {
		this.veiculo = veiculo;
		this.seguro = seguro;
	}
	
	public double calculoPrecoDeVenda() {
		
		String tipoVeiculo = veiculo.getClass().getSimpleName().toLowerCase();

		switch(seguro.toUpperCase()){
        case "ROUBO":
            return veiculo.calculoPrecoDeVenda()*0.02;
        case "ACIDENTE":
            if(tipoVeiculo.equals("carro") || tipoVeiculo.equals("caminhao")){
                return veiculo.calculoPrecoDeVenda()*0.03;
            }
            return veiculo.calculoPrecoDeVenda()*0.02;
        default:
            return veiculo.calculoPrecoDeVenda()*0.02;
		}
	}
		
	public Veiculo getveiculo() {
		return veiculo;
	}

	public void setveiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

}
