package centralGames;

public class Plataforma extends Jogo {

	public Plataforma(String nome, int preco) {
		super(nome, preco);
	}

	@Override
	boolean registraJogada(int score, boolean zerou) {
		if(zerou = true){
			setVezes_zerado(+1);
			setPontosX2pDaJogada(20);
		}
		if(getTopScore() < score){
			setTopScore(score);
		}
		setVezes_jogado(+1);
		return true;
	}

}
