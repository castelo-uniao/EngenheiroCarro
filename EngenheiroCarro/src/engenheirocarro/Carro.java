package engenheirocarro;
public class Carro {
	// Atributos da Classe carro!
	String marca; // Atributo marca do carro
	String modelo; // Atibuto modelo do carro
	int anofabricacao; // Atributo ano de fabricação
	String placa; // Atibuto placa do carro
	
	// Método da classe carro:
	void exibeCarro() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de fabricação: " + anofabricacao);
		System.out.println("Placa: "+ placa);
	}
}
