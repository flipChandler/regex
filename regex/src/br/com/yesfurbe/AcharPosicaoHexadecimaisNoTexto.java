package br.com.yesfurbe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcharPosicaoHexadecimaisNoTexto {

	public static void main(String[] args) {
		// hexadecimal = começa com 0, x ou X e o resto é de 0-9, a-f, A-F
		
		// ([0-9a-fA-F])+ vai procurar de 1 ou mais vezes
		// (\\s|$) seguido de espaço em branco ou fim de linha		
		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; 
		String texto = "x4852 0x 0X 0xffAB 0x10G 0x1";
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

