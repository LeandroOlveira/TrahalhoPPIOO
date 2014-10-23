package modeloEntidade;

public class Giganta extends Protagonista{
	private double fatorIncremento = 1/4;
	
	public Giganta(){
		super();
		quantidadeVida = 100;
		dano = 10;
		nome = "Giganta";
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
