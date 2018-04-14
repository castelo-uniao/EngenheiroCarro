package engenheirocarro;
public class EngenheiroCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.marca = "Volkswagen";
		carro1.modelo = "Gol";
		carro1.anofabricacao = 2014;
		carro1.placa = "ABC1234";
		carro1.exibeCarro();
		System.out.println();
		
		Carro carro2 = new Carro();
		carro2.marca = "Chevrolet";
		carro2.modelo = "Omega";
		carro2.anofabricacao = 1984;
		carro2.placa = "DEF5678";
		carro2.exibeCarro();
		System.out.println();
		
		Carro carro3 = new Carro();
		carro3.marca = "Ford";
		carro3.modelo = "Fiesta";
		carro3.anofabricacao = 2001;
		carro3.placa = "GHI9101";
		carro3.exibeCarro();
	}
}
