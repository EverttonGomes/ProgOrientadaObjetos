public class Cliente extends Pessoas {
	
	private String cpf;

	public Cliente(String nome, int idade, String cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}