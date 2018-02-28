/*
TOBIAS FURTADO 170141-X

Um matemático italiano da idade média conseguiu modelar o ritmo de
crescimento da população de coelhos através de uma sequência de
números naturais que passou a ser conhecida como Sequência de
Fibonacci. O n-ésimo número da sequência de Fibonacci Fn é dado pela
seguinte formula: Fi = Fi-1 + Fi-2
 O resultado é a sequência {1, 1, 2, 3, 5, 8, 13, 21, ...}. Escreva um
programa que, dado N inteiro positivo, calcula e escreve os N primeiros
números da sequência de Fibonacci.
 Exemplo de entrada e saída:
LP3 - Sintaxe Java - Primeiros Passos
Exercício 7
Entrada			Saída
8				1, 1, 2, 3, 5, 8, 13, 21
12				1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
*/
import java.util.Scanner;

public class ex7 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		int number = leitorTeclado.nextInt();
		
		fibonacci(number, 1, 0);
	}
	
	public static int fibonacci(int number, int a1, int a2){
		System.out.print((a1 + a2) + " ");
		
		if (number == 1)
			return 0;
		
		return fibonacci(number-1, a2, (a1+a2));
	}
}