package br.com.yesfurbe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcharPosicaoDiversasLetrasNoTexto {

	public static void main(String[] args) {
		// []
		String regex = "[abcABC]"; // achar a, ou b, ou c, ou A, ou B, ou C
		String texto = "arsBAet5$#cAC";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("indice: 0123456789");
		System.out.println("expressao: " + matcher.pattern());
		System.out.println("Posicoes encontradas");
		
		while(matcher.find()) {
			System.out.print(matcher.start() + " ");
		}

	}

}
