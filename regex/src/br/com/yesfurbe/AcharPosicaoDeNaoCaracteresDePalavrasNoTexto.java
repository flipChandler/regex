package br.com.yesfurbe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcharPosicaoDeNaoCaracteresDePalavrasNoTexto {

	public static void main(String[] args) {
		
		String regex = "\\W"; // não caracteres de palavras @#&*% espaço
		String texto = "#@ba 01aa a&56 ba986 \r_";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("indice:0123456789");
		System.out.println("expressao: " + matcher.pattern());
		System.out.println("Posicoes encontradas");
		
		while(matcher.find()) {
			System.out.print(matcher.start() + " ");
		}

	}

}
