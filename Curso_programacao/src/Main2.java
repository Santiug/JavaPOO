import java.util.Scanner;

public interface Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos casos serao lidos");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os valores");

			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();

			double media = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / 10.0;

			System.out.printf("A media ponderada e: %.1f%n", media);
		}
		sc.close();

	}
}
