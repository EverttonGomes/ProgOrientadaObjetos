public class Funcionario extends Pessoas {
	
	private double salario;
	
	public Funcionario(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}	
}