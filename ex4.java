/*
TOBIAS FURTADO 170141-X

Escrever um programa que, dado um ano qualquer, verifica se ele é
bissexto ou não
 São bissextos todos os anos múltiplos de 400, p.ex: 1600, 2000, 2400, 2800...
 São bissextos todos os múltiplos de 4 e não múltiplos de 100, p.ex: 1996, 2004,
2008, 2012, 2016…
 Não são bissextos todos os demais anos.
 Exemplo de entrada e saída
LP3 - Sintaxe Java - Primeiros Passos
Exercício 4
Entrada		Saída
1600		Ano bissexto
1997		Ano nao bissexto
2000		Ano bissexto
2016		Ano bissexto
*/
import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		int year = leitorTeclado.nextInt();
		
		if ((year % 400) == 0)
			System.out.println("Ano bissexto");
		else if ((year % 100) != 0 && (year % 4) == 0)
			System.out.println("Ano bissexto");
		else
			System.out.println("Ano nao bissexto");
	}
}