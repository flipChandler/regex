package br.com.yesfurbe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarEmailNoTexto {

	public static void main(String[] args) {
		
		// ([a-zA-Z0-9\\._-])+ :  de a até z, de A até Z, de 0 a 9, pode ter ., _ e -, se repete uma ou mais vezes
		// @(a-zA-Z)+ seguido de arroba, de a até z, de A até Z, uma ou mais vezes
		// \\.([a-zA-Z])+ : seguido de ponto, de a até z, de A até Z, uma ou mais vezes
		// (\\.([a-zA-Z])+)+ :repete de uma ou maiz vezes
		String email = "felipe.santos11@hotmail.com";
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; 
		String regex2 = "([\\w\\.-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; 
		String texto = "fu-l.a_no@hotmail.com, 102Abc@gmail.com, #@!abrao@mail, teste@gmail.com.br, teste@mail";
		Pattern pattern = Pattern.compile(regex2);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("indice: 0123456789");
		System.out.println("expressao: " + matcher.pattern());
		System.out.println("Posicoes encontradas");
		
		while(matcher.find()) {
			System.out.print(matcher.start() + " " + matcher.group() + "\n");
		}
		
		// validando email
		System.out.println(email.matches(regex2));
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

