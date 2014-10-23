package modeloEntidade;

public class LaternaVerde extends Protagonista{ 
	private int fatorIncremento = 1/3;
	
	public LaternaVerde(){
		super();
		quantidadeVida = 130;
		dano = 13;
		nome = "Lanterna Verde";
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
