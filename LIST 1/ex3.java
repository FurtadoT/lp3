/*
TOBIAS FURTADO 170141-X

Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que
verifica se o triângulo é:
 Escaleno (todos os lados diferentes)
 Isósceles (possui dois lados iguais)
 Equilátero (todos os lados iguais)
 Não forma triângulo (a soma de dois lados deve ser maiorque o terceiro lado)
 Os 3 números devem ser inteiros e lidos na mesma linha (Ex: 3 4 5)
 Exemplo de entrada e saída:
LP3 - Sintaxe Java - Primeiros Passos
Exercício 3
Entrada		Saída
2 3 2		Isosceles
3 3 3		Equilatero
1 2 4		Nao forma triangulo
*/
import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		int[] intStorage = new int[3];
		
		intStorage[0] = leitorTeclado.nextInt();
		intStorage[1] = leitorTeclado.nextInt();
		intStorage[2] = leitorTeclado.nextInt();
		
		if ((intStorage[0] + intStorage[1]) < intStorage[2] ||
			(intStorage[0] + intStorage[2]) < intStorage[1] ||
			(intStorage[1] + intStorage[2]) < intStorage[0]){
			System.out.println("Nao forma um triangulo");
			return;
		}
		
		if (intStorage[0] == intStorage[1] && intStorage[0] == intStorage[2])
			System.out.println("Equilatero");
		else if (intStorage[0] != intStorage[1] && intStorage[0] != intStorage[2] && intStorage[1] != intStorage[2])
			System.out.println("Escaleno");
		else
			System.out.println("Isosceles");
	}
}