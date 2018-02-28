/*
TOBIAS FURTADO 170141-X

Uma livraria está fazendo uma promoção para pagamento a vista. O
comprador pode escolher entre dois critérios de desconto:
 Critério A: R$ 0,25 por livro + R$ 7,50 fixo
 Critério B: R$ 0,50 por livro + R$ 2,50 fixo
 Faça um programa que o usuário informa a quantidade de livros e o
programa retorna qual o melhor critério de desconto
 Exemplo de entrada e saída:
LP3 - Sintaxe Java - Primeiros Passos
Exercício 2
Entrada		Saída
100			Criterio A
5			Criterio B
20			Indiferente
*/
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args){
		int numBooks;
		double valTotA, valTotB;
		Scanner leitorTeclado = new Scanner(System.in);
		numBooks = leitorTeclado.nextInt();
		
		valTotA = .25 * numBooks + 7.5;
		valTotB = .5 * numBooks + 2.5;

		if (valTotA < valTotB)
			System.out.println("Criterio A");
		else if (valTotB < valTotA)
			System.out.println("Criterio B");
		else
			System.out.println("Indiferente");
	}
}