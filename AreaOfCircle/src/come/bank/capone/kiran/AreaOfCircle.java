package come.bank.capone.kiran;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int radius = scanner.nextInt();
		
		double area = Math.PI * radius * radius;

		System.out.println("Pi * r * r = " + area);

		scanner.close();

	}

}
