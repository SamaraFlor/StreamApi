package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do ano e 
 * armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas 
acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
*/

public class Temperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Double> temperaturas = new ArrayList<Double>();

		int count = 0;
		while (true) {
			if (count == 6)
				break;

			System.out.println("Digite a temperatura");
			double temp = entrada.nextDouble();
			temperaturas.add(temp);
			count++;

		}

		System.out.print("Todas as temperaturas: ");
		temperaturas.forEach(t -> System.out.print(t + " "));

		double media = temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
		System.out.printf("\nM�dia das temperaturas: %.1f\n", media);

		System.out.println("\n\nMeses das temperaturas acima da m�dia: ");
		Iterator<Double> iterator = temperaturas.iterator();

		System.out.print("Temperaturas acima da m�dia: ");
		temperaturas.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));

		count = 0;
		while (iterator.hasNext()) {
			Double temp = iterator.next();
			if (temp > media) {
				switch (count) {
				case (0):
					System.out.printf("1 - janeiro: %.1f\n ", temp);
					break;
				case (1):
					System.out.printf("2 - fevereiro: %.1f\n", temp);
					break;
				case (2):
					System.out.printf("3 - mar�o: %.1f\n", temp);
					break;
				case (3):
					System.out.printf("4 - abril: %.1f\n", temp);
					break;
				case (4):
					System.out.printf("5 - maio: %.1f\n", temp);
					break;
				case (5):
					System.out.printf("6 - junho: %.1f\n", temp);
					break;
				default:
					System.out.println("N�o houve temperatura acima da m�dia.");
				}
			}
			count++;
		}
	}

}

