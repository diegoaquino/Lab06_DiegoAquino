package centralGames;

public class RPG extends Jogo {
	private int pontosDaJogada;
	public RPG(String nome, int preco) {
		super(nome, preco);
	}
	
	public void setPontosDaJogada(int pontos){
		pontosDaJogada = pontos;
	}
	public int getPontosDaJogada(){
		return pontosDaJogada;
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
		setPontosDaJogada(10);
	}

}
