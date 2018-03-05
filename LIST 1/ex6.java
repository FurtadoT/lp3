/*
TOBIAS FURTADO 170141-X

 Escreva um programa que, dada uma variável X com algum valor inteiro,
temos um novo X de acordo com a seguinte regra
 se x é par, x = x / 2
 se x é impar, x = 3 * x + 1
 O programa deve parar quando x tiver o valor final de 1. Por exemplo,
para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 Exemplo de entrada e saída
LP3 - Sintaxe Java - Primeiros Passos
Exercício 6
Entrada			Saída
13				40 20 10 5 16 8 4 2 1
35				106 53 160 80 40 20 10 5 16 8 4 2 1
3				10 5 16 8 4 2 1
34				17 52 26 13 40 20 10 5 16 8 4 2 1
*/
import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		int x = leitorTeclado.nextInt();
		
		while (x != 1){
			if ((x % 2) == 0)
				x /= 2;
			else
				x = 3 * x + 1;
			
			System.out.print(x + " ");
		}
	}
}