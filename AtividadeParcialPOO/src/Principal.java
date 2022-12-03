public class Principal {

	public static void main(String[] args) {
		// Carros
		Carros a = new Carros("Corolla", 2017, "Azul", 94875, 2, "Sedan");
		Seguro carroA = new Seguro(a, "Roubo");
		
		Carros b = new Carros("Palio", 2018, "Preto",61529 , 1, "Hatch");
		Seguro carroB = new Seguro(b, "Acidente");
		
		double respostaa = a.calculoPrecoDeVenda();
		double respostab = b.calculoPrecoDeVenda();
		double seguroa = carroA.calculoPrecoDeVenda();
		double segurob = carroB.calculoPrecoDeVenda();
		
		System.out.println("O preço de venda do Corolla é: " + respostaa + "\nO seguro do Corolla é: " + seguroa);
		System.out.println("O preço de venda do Palio é: " + respostab + "\nO seguro do Palio é: " + segurob);
		
		//Motos
		Motos c = new Motos("Titan", 2021, "Verde", 13556, 3, "Naked");
		Seguro motoC = new Seguro(c, "Acidente");
		Motos d = new Motos("CB1000RR", 2022, "Vermelha", 76997, 1, "Esportiva");
		Seguro motoD = new Seguro(d, "Roubo");
		Motos e = new Motos("S1000RR", 2023, "Verde", 87623, 2, "Esportiva");
		Seguro motoE = new Seguro(e, "Acidente");
		
		double respostac = c.calculoPrecoDeVenda();
		double respostad = d.calculoPrecoDeVenda();
		double respostae = e.calculoPrecoDeVenda();
		double seguroc = motoC.calculoPrecoDeVenda();
		double segurod = motoD.calculoPrecoDeVenda();
		double seguroe = motoE.calculoPrecoDeVenda();
		
		System.out.println("O preço de venda da Titan é: " + respostac + "\nO seguro da Titan é: "+ seguroc);
		System.out.println("O preço de venda da CB1000RR é: " + respostad + "\nO seguro da CB1000RR é: " + segurod);
		System.out.println("O preço de venda da S1000RR é: " + respostae + "\nO seguro da S1000RR é: " + seguroe);
		
		//Caminhões
		Caminhoes f = new Caminhoes("Delivery 4.160", 2016, "Amarelo",103600, 4, 2999);
		Seguro caminhaoF = new Seguro(f, "Roubo");
		Caminhoes g = new Caminhoes("Meteor 28.460", 2019, "Branco",134500, 2, 3000);
		Seguro caminhaoG = new Seguro(g, "Acidente");
		
		double respostaf = f.calculoPrecoDeVenda();
		double respostag = g.calculoPrecoDeVenda();
		double segurof = caminhaoF.calculoPrecoDeVenda();
		double segurog = caminhaoG.calculoPrecoDeVenda();
		
		System.out.println("O preço de venda do Delivery 4.160 é: " + respostaf + "\nO seguro do Delivery 4.160 é: " + segurof);
		System.out.println("O preço de venda do Meteor 28.460 é: " + respostag + "\nO seguro do Meteor 28.460 é: " + segurog);
		
		//Quadriciclos
		Quadriciclo h = new Quadriciclo("Taurus", 2012, "Roxo", 11990, 1, 110);
		Seguro quadricicloH = new Seguro(h, "Acidente");
		Quadriciclo i = new Quadriciclo("TRX 420 FourTrax", 2017, "Vermelho", 39580, 1, 420);
		Seguro quadricicloI = new Seguro(i, "Roubo");
		
		double respostah = h.calculoPrecoDeVenda();
		double respostai = i.calculoPrecoDeVenda();
		double seguroh = quadricicloH.calculoPrecoDeVenda();
		double seguroi = quadricicloI.calculoPrecoDeVenda();
		
		System.out.println("O preço de venda do Taurus é: " + respostah + "\nO seguro do Taurus é: " + seguroh);
		System.out.println("O preço de venda do TRX 420 FourTrax é: " + respostai + "\nO seguro do TRX 420 FourTrax é: " + seguroi);
	}

}