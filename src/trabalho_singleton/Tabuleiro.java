package trabalho_singleton;

public class Tabuleiro {
	
	static private Tabuleiro instance = null;
	
	private Tabuleiro() {}
	
	static Tabuleiro getInstance() {
		if(instance == null) {
			instance = new Tabuleiro();
			return instance;
		} else {
			return instance;
		}
	}
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiroXadrez = Tabuleiro.getInstance();
		
		System.out.println("Esse é o objeto que foi criado: " + tabuleiroXadrez);
		
		Tabuleiro tabuleiroXadrez2 = Tabuleiro.getInstance();
		
		System.out.println("Esse é o mesmo objeto sendo chamado sem criar um novo: " + tabuleiroXadrez2);
	}

}
