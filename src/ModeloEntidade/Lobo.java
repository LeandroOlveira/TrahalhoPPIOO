package modeloEntidade;

public class Lobo extends Antagonista{

	public Lobo(){
		quantidadeVida = 180;
		dano = 18;
		nome = "Lobo";
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
