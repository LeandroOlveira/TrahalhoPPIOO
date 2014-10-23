package utilitarios;

import java.util.*;

import modeloEntidade.*;
public class Utilitarios {

	public static boolean getRandomBool(){
		Random random = new Random();
		return random.nextBoolean();
	}
	
	public static  int getRandomInt(int intervaloVaria){
		Random random = new Random();
		//retorna valores pseudo aleatórios de 0 ate o valor passado como parametro
		return random.nextInt(intervaloVaria + 1);
	}
	
	public static Personagem getPersonagem(String nome){
		if(nome == "Aquaman"){
			AquaMan aquaman = new AquaMan();
			return aquaman;
		}
		else {
			return null;
		}
	}
	
	public static int getScanInt(int variavel){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		variavel = scan.nextInt();
		return variavel;
	}
	
	public static String getScanString(String variavel){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		variavel = scan.next();
		return variavel;
	}
	
	public static int retornaPersonagem(){
		int escolhe = 0;
		System.out.println("1.Aqua Man(P)\n2.Batman(A)\n3.Coringa(P)\n"
						+ "4.Flash(A)\n5.Giganta(P)\n7.Lanterna Verde(P)\n"
						+ "8.Lex Luthor(A)\n9.Lobo(P)\n10.Mulher Maravilha(P)\n"
						+ "11.Sinestro(P)\n12.Superman(A)\n13.Volcana");
		return escolhe = getScanInt(escolhe);
	
	}
}
