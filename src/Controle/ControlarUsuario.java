package controle;

import enums.Perfil;

import java.util.Scanner;

import modeloEntidade.Batman;
import modeloEntidade.Usuario;
public class ControlarUsuario {
	
	public Usuario cadastrarUsuario(String nome){
		Usuario user = new Usuario();
		user.setNome(nome);
		return user;
	}
	
	public void informarRanking(){
		Usuario user = new Usuario();
		int score;
		score = user.getScore();
		System.out.println("score :"+score);
	}
}
