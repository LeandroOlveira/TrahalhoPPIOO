package modeloEntidade;

public class Coringa extends Protagonista{

	public Coringa(){
		super();
		quantidadeVida = 150;
		dano =15;
		nome = "Coringa";
	}
	
	@Override
	public String toString(){
		return "nome: " + nome + "\n" 
			  +"Quantidade de Vida: " + quantidadeVida + "\n"
			  +"Poder de Dano: " + dano + "\n\n";
	}
	
	
	@Override
	public double calcularFatorIncremento() {
		double incremento =  (int) (this.getQuantidadeVida()*fatorIncremento);
		return incremento;
	}

	@Override
	public int getDano() {
		return dano;
	}



}
