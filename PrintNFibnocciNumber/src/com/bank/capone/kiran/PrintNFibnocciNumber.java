package com.bank.capone.kiran;

public class PrintNFibnocciNumber {

	public static void main(String[] args) {

		int pn = 0;
		int cn = 1;
		int nn = 0;
		System.out.println(pn);
		System.out.println(cn);

		// prints n fibnocci number where n =100;
		for (int i = 0; i < 100; i++) {
			nn = pn + cn;
			System.out.println(nn);
			pn = cn;
			cn = nn;
		}

		System.out.println("\n\n\n");

		// prints fibnocci numbers within n where n = 100

		pn = 0;
		cn = 1;
		nn = 0;
		System.out.println(pn);
		System.out.println(cn);
		for (; true;) {
			nn = pn + cn;
			if (nn >= 100) {
				break;
			} else {
				System.out.println(nn);
				pn = cn;
				cn = nn;
			}
		}

	}

}
