package modeloEntidade;

public class Sinestro extends Protagonista{
	private double fatorIncremento = 1/2;
	
	public Sinestro(){
		super();
		quantidadeVida = 105;
		dano = 10;
		nome = "Sinestro";
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
