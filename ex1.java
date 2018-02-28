/*
TOBIAS FURTADO 170141-X

Leia 5 números inteiros e calcule imprima o maior e o menor número
 Cada número deve ser lido após pressionar ‘Enter’
 Exemplo de entrada e saída:
LP3 - Sintaxe Java - Primeiros Passos
Exercício 1
Entrada			Saída
10 5 3 6 3		Maior: 10, Menor: 3
3 9 6 2 8		Maior: 9, Menor: 2
1 3 4 1 1		Maior: 4, Menor: 1
3 8 4 4 7		Maior: 8, Menor: 3
*/
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args){
		int numAux, numMax = 0, numMin = 0;

		Scanner leitorTeclado = new Scanner(System.in);

		for (int contadorA = 0; contadorA < 5; contadorA++){
			numAux = leitorTeclado.nextInt();
			if (contadorA == 0){
				numMax = numMin = numAux;
				continue;
			}
			
			if (numMax < numAux)
				numMax = numAux;
			if (numMin > numAux)
				numMin = numAux;
		}

		System.out.println("Maior: " + numMax + ", Menor: " + numMin);
	}
}