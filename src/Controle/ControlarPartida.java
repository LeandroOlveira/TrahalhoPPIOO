package controle;

import enums.Cenario;

import java.util.ArrayList;
import java.util.List;




import modeloEntidade.EquipeUsuario;
import modeloEntidade.Personagem;
import controle.ControlarEquipe;


public class ControlarPartida {

	ControlarEquipe persona = new ControlarEquipe();

	public void iniciarPartida() {

	}

	public EquipeUsuario escolherEquipe() {
		EquipeUsuario Equipe = new EquipeUsuario();
		ControlarEquipeUsuario eqp = new ControlarEquipeUsuario();
		return Equipe;
	}

	public void mostrarEquipe(EquipeUsuario equipe){
			System.out.println(equipe);
		}	
	

	public void armazenaScoreUsuario(int ponintRodada) {

	}

	public void jogadaVez() {

	}

	public void escolherPersonagemVez() {

	}

	public void escolherCenario() {

	}
}
