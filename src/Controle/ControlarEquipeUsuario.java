package controle;
import java.util.ArrayList;
import java.util.List;

import modeloEntidade.*;
import utilitarios.Utilitarios;

public class ControlarEquipeUsuario {
	
	public List<Personagem> addPersonagem(String nome){	
		EquipeUsuario equipe = new EquipeUsuario();
		Personagem personagem;
		personagem = Utilitarios.getPersonagem(nome);
		equipe.setListaPersonagem(personagem);
		return equipe.getListaPersonagem();
	}
	
	
}
