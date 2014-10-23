package modeloEntidade;

import utilitarios.Utilitarios;

public abstract class Antagonista extends Personagem {
	private static int PODER_ATAQUE = 2;
			
	public String atacar (Personagem atacado) {
		String saida = atacado.reagir(this.getDano()*PODER_ATAQUE);
		return saida;
	}


	@Override
	public int getResistencia(int reducao) {
		int resistencia = Utilitarios.getRandomInt(reducao);
		return resistencia;
	}
	
}
