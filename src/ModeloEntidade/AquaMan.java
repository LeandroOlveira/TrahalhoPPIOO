package modeloEntidade;

public class AquaMan extends Protagonista{
	private double fatorIncremento = 1/5;
	
	public AquaMan(){
		quantidadeVida = 50;
		nome = "Aqua Man";
		dano = 5;
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
