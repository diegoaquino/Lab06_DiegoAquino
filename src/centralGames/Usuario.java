package centralGames;

import java.util.ArrayList;
/**
 * 
 * @author DiegoAquino
 *
 */
public abstract class Usuario {
	private String nome;
	private String nomeLogin;
	ArrayList<Jogo> meusJogos;
	private double meuDinheirinho = 0;
	private int x2p;
	
	public Usuario(String nome , String nome_login){
		this.nome = nome;
		this.nomeLogin = nome_login;
		meusJogos = new ArrayList<Jogo>();
	}

	public double getMeuDinheirinho() {
		return meuDinheirinho;
	}

	public void setMeuDinheirinho(double meu_dinheirinho) {
		this.meuDinheirinho = meu_dinheirinho;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeLogin() {
		return nomeLogin;
	}
	
	public int getX2p(){
		return x2p;
	}
	public void setX2p(int x2p){
		this.x2p = x2p;
	}
	public boolean registraJogada(String nomeDoJogo , int score , boolean zerou){
	for (Jogo jogo : meusJogos) {
		if(jogo.getNome().equals(nomeDoJogo)){
			return jogo.registraJogada(score, zerou);
		}
	}
	return false;
	}
	
	abstract boolean compraJoguinho(Jogo joguinho) throws Exception;

}
