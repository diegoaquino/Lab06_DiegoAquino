package centralGames;

public class RPG extends Jogo {
	public RPG(String nome, int preco) {
		super(nome, preco);
	}
	
	
	
	
	@Override
	boolean registraJogada(int score, boolean zerou) {
		if(zerou == true){
			setVezes_zerado(+1);
		}
		if(getTopScore() > score){
			setTopScore(score);
			setVezes_zerado(+1);
		}
		setVezes_jogado(+1);
		setPontosX2pDaJogada(10);
		return true;
	}

}
