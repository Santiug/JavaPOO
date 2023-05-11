package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangule;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Triangule x, y;
		x = new Triangule();
		y = new Triangule();

		System.out.println("Digite os valores do triangulo X");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os valores do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areax = x.area();
		double areay = y.area();

		System.out.printf("tringule X area: %.4f%n", areax);
		System.out.printf("Triangule Y area: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("higher area: X");
		} else {
			System.out.println("higher area: Y");
		}
		sc.close();
	}

}
