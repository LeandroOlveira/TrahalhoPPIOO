package visao;

import modeloEntidade.EquipeUsuario;
import modeloEntidade.Usuario;
import controle.ControlarPartida;
import controle.ControlarUsuario;
import utilitarios.*;

public class Jogo {
	ControlarPartida controlPartida = new ControlarPartida();
	Usuario user = new Usuario();
	
	
	public void iniciarJogo(){
		menuInicio();
	}
	
	
	public void sairJogo(){
		int x = 0;
		System.out.println("Tem certeza que deseja sair do jogo? (1 - sim / 2 - não ");
		x = Utilitarios.getScanInt(x);
		switch (x) {
		case 1:
			break;
		case 2:
			iniciarJogo();
			break;
		default:
			break;
		}
	}
	
	public void menuInicio(){
		EquipeUsuario equipe = new EquipeUsuario();
		int x=0;
		String nome = "";
		System.out.println("Antes de Começar, nos diga seu nome ! ");
		ControlarUsuario controlUser = new ControlarUsuario();
		user = controlUser.cadastrarUsuario(nome);
		System.out.println("Olá " + user.getNome()+ " Bem vindo ao Justice League Card Game !!" );
		do{
			System.out.println("\nMenu Principal\n\n\n");
			System.out.println("(1) Escolha sua Equipe");
			System.out.println("(2) Escolha um cenário");
			System.out.println("(3) Iniciar partida");
			System.out.println("(4) Configurações");
			System.out.println("(5) Score");
			System.out.println("(6) Sair do jogo");
			x = Utilitarios.getScanInt(x);
			switch(x){
			case 1:
				equipe = controlPartida.escolherEquipe();				
				break;
			case 2:
				controlPartida.escolherCenario();
				break;
			case 3:
				controlPartida.iniciarPartida();
				break;
			case 4:
				System.out.println("Ainda não desenvolvido");
				//iniciarJogo;
				break;
			case 5:
				System.out.println("Ainda não desenvolvido");
				//iniciarJogo;
				break;
			case 6:
				controlPartida.mostrarEquipe(equipe);
				break;
			case 7:
				sairJogo();
				break;
			default:
				break;
			}
		}while(x!=7);
	}
	
	
	public void tela(){
		//pegar equipes, pegar cenario
	}
	
	
}
