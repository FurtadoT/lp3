/*
TOBIAS FURTADO 170141-X

Escreva um programa que calcule o fatorial de um número N
 O fatorial de um número n é N * (N-1) * (N-2) ... até N = 1
 Exemplo de entrada e saída
LP3 - Sintaxe Java - Primeiros Passos
Exercício 5
Entrada		Saída
0			1
1			1
2			2
3			6
4			24
*/
import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		int number = leitorTeclado.nextInt();
		
		System.out.println(fat(number));
	}
	
	public static int fat(int number){
		if (number == 0)
			return 1;
		
		return (number * fat(number-1));
	}
}