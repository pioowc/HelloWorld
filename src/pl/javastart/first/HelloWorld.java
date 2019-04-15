package pl.javastart.first;

import java.io.*;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello World \n Podaj liczbę: ...");

		HelloWorld h = new HelloWorld();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		int i = Integer.parseInt(s);
		System.out.printf("Liczba to %d .%n", i);

	//	System.out.println("Wynik... dla " + i + " = " + h.fibo(i));

		System.out.println("\nWynik...2 dla " + i + " = " + h.fibo2(i));

	}

	private int fibo(int n) {
		int res = -1;

		if (n == 0 || n == 1)
			return n;

		if (n >= 2)
			return fibo(n - 1) + fibo(n - 2);

		return res;
	}

	private int fibo2(int n) {

		if (n == 0 || n == 1)
			return n;
		int a = 0, b = 1;
		int suma = -1;

		for (int i = 2; i <= n; i++) {
			suma = a + b;
			a = b;
			b = suma;
		}

		return suma;
	}

}
