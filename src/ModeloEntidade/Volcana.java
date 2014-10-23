package modeloEntidade;

public class Volcana extends Antagonista{

	public Volcana() {
		super();
		quantidadeVida = 100;
		dano = 10;
		nome = "Volcana";
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
