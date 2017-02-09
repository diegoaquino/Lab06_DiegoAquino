package centralGames;

public class Plataforma extends Jogo {

	public Plataforma(String nome, int preco) {
		super(nome, preco);
	}

	@Override
	boolean registraJogada(int score, boolean zerou) {
		return true;
	}

}
