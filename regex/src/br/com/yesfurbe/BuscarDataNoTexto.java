package br.com.yesfurbe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarDataNoTexto {

	public static void main(String[] args) {
		
		String regex = "\\d{2}/\\d{2}/\\d{2,4}"; 
		String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("indice: 0123456789");
		System.out.println("expressao: " + matcher.pattern());
		System.out.println("Posicoes encontradas");
		
		while(matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
		
		
	}

}

// QUANTIFICADORES
// ? zero ou uma
// * zero ou mais
// + uma ou mais
// {n,m} de n até m ocorrências
// () agrupa uma expressão
// | ou
// $ fim de linha, encontrar algo que esteja no fim da linha

// o(v|o)o procure algo que comece com o, seguido de v ou c, depois o : ovo, ou oco

