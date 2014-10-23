package modeloEntidade;

public class MulherMaravilha extends Protagonista{ 
	private double fatorIncremento = 1/2;
	
	public MulherMaravilha(){
		super();
		quantidadeVida = 100;
		dano = 10;
		nome = "Mulher Maravilha";
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
