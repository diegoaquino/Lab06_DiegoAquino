package centralGames;

public class Luta extends Jogo {

	public Luta(String nome, int preco) {
		super(nome, preco);
	}

	@Override
	boolean registraJogada(int score, boolean zerou) {
		if(zerou = true){
			setVezes_zerado(+1);
		}
		if(getTopScore() < score){
			setTopScore(score);
			setPontosX2pDaJogada((getTopScore()/1000));
		}
		setVezes_jogado(+1);
		return true;
	}

}
