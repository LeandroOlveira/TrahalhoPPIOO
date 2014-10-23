package modeloEntidade;

import utilitarios.*;

public abstract class Personagem {
	protected String nome;
	protected double quantidadeVida;
	protected int dano;
	
	public abstract int getDano();
	
	public abstract int getResistencia(int reducao);
	
	public abstract String atacar(Personagem atacado);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantidadeVida() {
		return quantidadeVida;
	}

	public void setQuantidadeVida(double quantidadeVida) {
		this.quantidadeVida = quantidadeVida;
	}

	public void sofrerDano(int reducao){
		this.quantidadeVida = this.quantidadeVida - reducao;
	}

	
	public String reagir(int reducao){
		String saida;
		boolean defesa = Utilitarios.getRandomBool();
		sofrerDano(reducao);
		saida = this.getNome() + "sofreu dano";
		if (defesa){
			this.setQuantidadeVida(this.getResistencia(reducao));
			saida = saida + "mas se defendeu";
		}
		return saida;
	}
}
