import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String e1 = "entrada1.txt";
		File a1 = new File(e1);
		String e2 = "entrada2.txt";
		File a2 = new File(e2);
		
		ArrayList<Pessoas> cadastradas = new ArrayList<Pessoas>();
		Scanner s = null;
		try {
			s = new Scanner(a1);
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo inexistente!");
			return;
		}
			
		while(s.hasNext()) {
			String dados[] = s.nextLine().split(",");
			String nome = dados[0];
			int idade = Integer.parseInt(dados[1]);
			
			try {
				double salario = Double.parseDouble(dados[2]);
				Funcionario f = new Funcionario(nome, idade, salario);
				cadastradas.add(f);
			}catch(NumberFormatException ex){
				Cliente c = new Cliente(nome, idade, dados[2]);
				cadastradas.add(c);
				}
			}
		s.close();
		
		List<Pcs> estoque = new ArrayList<Pcs>();
		
		try {
			s = new Scanner(a2);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo inexistente!");
		}
		
		while(s.hasNext()) {
			String dados[] = s.nextLine().split(",");
			
			switch(dados.length){
			case 5:
				Pc aux = new Pc(dados[0], dados[1], Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), Integer.parseInt(dados[4]));
				estoque.add(aux);
				break;
			case 6:
				PcGamer aug = new PcGamer(dados[0], dados[1], Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4], Integer.parseInt(dados[5]));
				estoque.add(aug);
				break;
				default:
					System.out.println("Arquivo inválido!");
					return;
			}
								
		}
		
		double media = 0;
		for(Pessoas p : cadastradas) {
			media += (double) p.getIdade() / cadastradas.size();
		}
		escreverArquivo("A media de idade das pessoas eh: " + media, "Resultado1.txt");
		
		double total = 0;
		for(Pcs p : estoque) {
			total += p.getPreco();
		}
		escreverArquivo("A somatoria dos precos dos pcs eh: " + total, "Resultado2.txt");
	}
	
	public static void escreverArquivo(String data, String arqname) {
        File aq = new File(arqname);
        try{
            FileWriter archive = new FileWriter(aq);
            archive.write(data);
            archive.close();
        }catch(IOException ex){
            System.err.println("Falha ao criar arquivo\n log: " + ex.getMessage());
        }
    }
}
