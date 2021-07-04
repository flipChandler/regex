package br.com.yesfurbe;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToBigDecimal {

	public static void main(String[] args) {
		String valor = "(0 a 1200,45)";
		System.out.println(extrairValor(valor));		
	}
	
	private static BigDecimal extrairValor(String str) {
		String regex = "([^\\(^\\s])([\\d\\.,])+([^\\)^\\s])";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		String resultado = "";
		while (matcher.find()) {
			resultado = matcher.group().replace(",", ".");			 
		}		
		return new BigDecimal(resultado);
	}
}

//QUANTIFICADORES
//? zero ou uma
//* zero ou mais
//+ uma ou mais
//{n,m} de n até m ocorrências
//() agrupa uma expressão
//| ou
//$ fim de linha, encontrar algo que esteja no fim da linha

