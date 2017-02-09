package centralGames;

public class Luta extends Jogo {

	public Luta(String nome, int preco) {
		super(nome, preco);
	}

	@Override
	boolean registraJogada(int score, boolean zerou) {
		return true;
	}

}
