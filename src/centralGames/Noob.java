package centralGames;

public class Noob extends Usuario {
	double DESCONTON = 0.1;
	public Noob(String nome, String nome_login) {
		super(nome, nome_login);
		setX2p(0);
	}

	@Override
	boolean compraJoguinho(Jogo joguinho) throws Exception {
		if(joguinho.getPreco()>getMeuDinheirinho()){
			throw new Exception("Saldo insuficiente");
		}
		else{
			setMeuDinheirinho(getMeuDinheirinho() - (joguinho.getPreco() * DESCONTON));
		}
		meusJogos.add(joguinho);
		setX2p(getX2p() + 10 * joguinho.getPreco());
		return true;
	}

	
	
}
