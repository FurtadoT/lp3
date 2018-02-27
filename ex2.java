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