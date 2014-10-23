package modeloEntidade;


public class LexLuthor extends Antagonista{
	
	
	public LexLuthor(){
		super();
		quantidadeVida=180;
		nome = "Lex Luthor";
		dano = 18;
	}
	
	@Override
	public String toString(){
		return "nome: " + nome + "\n" 
			  +"Quantidade de Vida: " + quantidadeVida + "\n"
			  +"Poder de Dano: " + dano + "\n\n";
	}
	
	
	@Override
	public int getDano() {
		return dano;
		
	}

}
