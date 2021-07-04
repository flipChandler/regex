package br.com.yesfurbe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcharPosicaoTodasLetrasENumerosNoTexto {

	public static void main(String[] args) {
		// []
		String regex = "[a-zA-z0-9]"; // de a até z, de A até Z, de 0 a 9
		String texto = "$2#$fgaI*p9012agz&";
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
