/*
TOBIAS FURTADO 170141-X

Faça um programa que construa dois vetores A e B de 5 posições, lendo e
adicionando valores inteiros a esses vetores. Crie um terceiro vetor C,
composto pela soma dos elementos de A e B. Exemplo:
 C[0] = A[0] + B[0]
 C[1] = A[1] + B[1]
 Após isso, escreva o conteúdo do vetor C, separados por vírgula
 Exemplo de entrada e saída:
LP3 - Sintaxe Java - Primeiros Passos
Exercício 9
Entrada					Saída
2 5 8 34 5				10, 56, 10, 50, 10
8 51 2 16 5

-10 0 10 20 30			90, 50, 10, -30, -70
100 50 0 -50 -100
*/
import java.util.Scanner;

public class ex9 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int[] vetC = new int[5];
		
		for (int i = 0; i < 5; i++){
			vetA[i] = leitorTeclado.nextInt();
		}
		
		for (int i = 0; i < 5; i++){
			vetB[i] = leitorTeclado.nextInt();
		}
		
		for (int i = 0; i < 5; i++){
			vetC[i] = vetA[i] + vetB[i];
			System.out.print(vetC[i]);
			
			if (i != 4)
				System.out.print(", ");
		}
	}
}