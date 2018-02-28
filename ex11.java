/*
TOBIAS FURTADO 170141-X

Osmar adora chocolates e vai para a loja com $N dinheiro no bolso. O
preço de cada chocolate é $C. A loja oferece um desconto: para cada M
(sempre maior que 1) embalagens que ele dá para a loja, ele ganha um
chocolate grátis. Quantos chocolates Osmar consegue comer?

 Por exemplo: Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar
as 5 embalagens por mais 1 chocolate, fazendo com que o número total de
chocolates que ele pode comer seja 6.

 Para N=6, C=2, M=2, ele pode comprar 3 chocolates por $6 e trocar 2 embalagens
por mais 1 chocolate. Após o consumo, ele troca as 2 embalagens restantes por
mais 1 chocolate, totalizando 5.

LP3 - Sintaxe Java - Primeiros Passos
Exercício 11
Entrada (N, C e M)	Saída
10 2 5				6
12 4 4				3
6 2 2				5
43203 60 5			899
*/
import java.util.Scanner;

public class ex11 {
	
	public static void main(String[] args){
		Scanner leitorTeclado = new Scanner(System.in);
		double totMoney = leitorTeclado.nextInt();
		double price = leitorTeclado.nextInt();
		int discountEmb = leitorTeclado.nextInt();
		
		int totChocolate = (int) (totMoney / price);
		totChocolate += exchangeEmbToChocolate(totChocolate, discountEmb);
		
		System.out.println(totChocolate);
	}
	
	public static int exchangeEmbToChocolate(int emb, int chocPerEmb){
		if (emb < chocPerEmb)
			return 0;
		
		int extraChocolates = (int) (emb / chocPerEmb);
		
		//return extraChocolates + exchangeEmbToChocolate((totEmbQ + totNewEmb), K)
		return (extraChocolates + exchangeEmbToChocolate(((emb % chocPerEmb) + extraChocolates), chocPerEmb));
	}
}