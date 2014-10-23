package modeloEntidade;


public class SuperMan extends Antagonista  {
	
	public SuperMan(){
		super();
		quantidadeVida = 200;
		dano = 20;
		nome = "Superman";
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
