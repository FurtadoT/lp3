/*
TOBIAS FURTADO 170141-X

Faça um programa que efetue a leitura de 5 elementos inteiros para um
vetor A. No final, apresente o total da soma de todos os elementos
ímpares e pares
 Exemplo de entrada e saída:
LP3 - Sintaxe Java - Primeiros Passos
Exercício 10
Entrada			Saída
2 19 4 3 0		Soma dos pares: 6. Soma dos impares: 22
1 2 3 4 5		Soma dos pares: 6. Soma dos impares: 9
*/
import java.util.Scanner;

public class ex10 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		int[] vetA = new int[5];
		int totImpar = 0;
		int totPar = 0;
		
		for (int i = 0; i < 5; i++){
			vetA[i] = leitorTeclado.nextInt();
		}
		
		for (int i = 0; i < 5; i++){
			if ((vetA[i] % 2) == 0)
				totPar += vetA[i];
			else
				totImpar += vetA[i];
		}
		
		System.out.println("Soma dos pares: " + totPar + ". Soma dos impares: " +  totImpar);
	}
}