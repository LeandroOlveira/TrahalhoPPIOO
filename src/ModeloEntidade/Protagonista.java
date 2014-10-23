package modeloEntidade;

import utilitarios.Utilitarios;

public abstract class Protagonista extends Personagem {
	protected double fatorIncremento;
	
	public abstract double calcularFatorIncremento();
	
	
	public void incrementarVida(Personagem personagem, int fatorIncremento){
		personagem.setQuantidadeVida(personagem.getQuantidadeVida()+fatorIncremento);
	}
	
	public String atacar (Personagem atacado){
		String saida = atacado.reagir(this.getDano());
		return saida;
	}
	
	@Override
	public int getResistencia(int reducao) {
		int resistencia = Utilitarios.getRandomInt(reducao);
		return resistencia;
	}
	
}
