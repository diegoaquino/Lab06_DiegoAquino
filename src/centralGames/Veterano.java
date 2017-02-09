package centralGames;

public class Veterano extends Usuario{
	double DESCONTOV = 0.1;
	public Veterano(String nome, String nome_login) {
		super(nome, nome_login);
		setX2p(1000);
	}

	@Override
	boolean compraJoguinho(Jogo joguinho) throws Exception{
		if(joguinho.getPreco()>getMeuDinheirinho()){
			throw new Exception("Saldo insuficiente");
		}
		else{
			setMeuDinheirinho(getMeuDinheirinho() - (joguinho.getPreco() * DESCONTOV));
		}
		meusJogos.add(joguinho);
		setX2p(getX2p() + 15 * joguinho.getPreco());
		return true;
	}
	
}
