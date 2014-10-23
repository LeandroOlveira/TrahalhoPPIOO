package modeloEntidade;
import java.util.ArrayList;
import java.util.List;

import enums.Cenario;

public class EquipeUsuario {
	private String nome;
	private Cenario cenario;
	private List<Personagem> listaPersonagem = new ArrayList<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Cenario getCenario() {
		return cenario;
	}
	public void setCenario(Cenario cenario) {
		this.cenario = cenario;
	}
	public List<Personagem> getListaPersonagem() {
		return listaPersonagem;
	}
	public void setListaPersonagem(Personagem personagem) {
		this.listaPersonagem.add(personagem);
	}
	
	@Override
	public String toString(){
		return "Nome da Equipe: " + nome +"\n" +
				"Personagens: " + listaPersonagem;
	} 
	
}
