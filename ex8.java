/*
TOBIAS FURTADO 170141-X

Faça um programa que leia dados de temperatura durante uma semana
(7 leituras), armazenando em um vetor. Após isso, escreve quantos dias
dessa semana a temperatura esteve acima da média
 As 7 temperaturas devem ser lidas na mesma linha, separada por espaço
 Exemplo de entrada e saída:
LP3 - Sintaxe Java - Primeiros Passos
Exercício 8
Entrada					Saída
2 2 2 2 2 2 3			1
21 10 13 34 30 21 34	3
2 2 2 2 2 2 1			6
*/
import java.util.Scanner;

public class ex8 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		int[] intStorage = new int[7];
		int totAcM = 0;
		double media = 0;
		
		for (int i = 0; i < 7; i++){
			intStorage[i] = leitorTeclado.nextInt();
			media += intStorage[i];
		}
		media /= 7.0;
		
		for (int i = 0; i < 7; i++){
			if (intStorage[i] > media)
				totAcM++;
		}
		
		System.out.println(totAcM);
	}
}