package centralGames;

import java.util.ArrayList;
/**
 * 
 * @author DiegoAquino
 *
 */
public class Usuario {
	private String nome;
	private String nomeLogin;
	ArrayList<Jogo> meusJogos;
	private double meuDinheirinho = 0;
	private String tipo = "noob";
	
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
	
	public String getTipo(){
		return tipo;
	}
	
	public void compraJoguinho(Jogo joguinho) throws Exception{
		if(joguinho.getPreco()>getMeuDinheirinho()){
			throw new Exception("Fundos insuficientes.");
		}
		else{
			if(getTipo().equalsIgnoreCase("noob")){
				setMeuDinheirinho( ( getMeuDinheirinho() - ((joguinho.getPreco()*10)/100)));
			}
			else{
				setMeuDinheirinho( ( getMeuDinheirinho() - ((joguinho.getPreco()*20)/100)));
			}
		}
	}

}
