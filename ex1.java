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

		System.out.println("Min: " + numMin + "\nMax: " + numMax);
	}
}