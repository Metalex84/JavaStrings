package strings;

import java.util.Scanner;


public class Main {
	
	/*
	 * checkPalindrome(String) verifica si una palabra es un palindromo
	 * */
	public static boolean checkPalindrome(String s1) {
		
		StringBuilder sg = new StringBuilder(s1);
		String s2 = sg.reverse().toString();
		
		return (s1.equals(s2));
		
	}
	
	/*
	 * sumASCII devuelve la suma de los valores ASCII de un String
	 * */
	public static int sumASCII(String s) {
		
		int value = 0;
		
		for (char c : s.toCharArray())
			value += c;
		
		return value;
	}
	
	
	/*
	 * checkAnagram(String, String) recibe dos cadenas y devuelve T o F dependiendo de si son anagramas entre si 
	 * */
	public static boolean checkAnagram(String s1, String s2) {
		
		int checksum1 = sumASCII(s1.toLowerCase());
		int checksum2 = sumASCII(s2.toLowerCase());
		
		return checksum1 == checksum2;
		
	}
	
	/*
	 * pressKey(Scanner) empaqueta la secuencia de pedir una tecla al usuario para que continue la ejecucion del programa
	 * */
	public static void pressKey(Scanner sc) {
		System.out.println("Presiona INTRO para continuar...");
		sc.nextLine();
	}

	/*
	 * isIsogram(String) comprueba si una palabra String es un isograma o no
	 * */
	public static boolean isIsogram(String s) {
		if (s.length() == 1)
			return true;
		
		char[] palabras = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < i; j ++) {
				if (palabras[i] == palabras[j])
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PALINDROMOS, ANAGRAMAS E ISOGRAMAS");
		pressKey(sc);
		
		System.out.println("**** PALINDROMOS: palabras que se escriben igual de izquierda a derecha y de derecha a izquierda. ****");		
		String word = null;
		do {
			System.out.println("Dime una palabra y comprombaré si es un palindromo:");
			word = sc.nextLine();
		} while (word == "");
		

		if (checkPalindrome(word))
			System.out.println("'" + word + "' es un palindromo");
		else
			System.out.println("'" + word + "' no es un palindromo");
		
		pressKey(sc);
		
		System.out.println("**** ANAGRAMAS: palabras que contienen exactamente las mismas letras que otra, pero en otro orden. ****");
		String another = null;
		String third = null;
		System.out.println("Dime dos palabras y comprobare si son anagramas:");
		do {
			System.out.println("¿Cual es la primera?:");
			another = sc.nextLine();
		} while (another == "");
		do {
			System.out.println("¿Cual es la segunda?:");
			third = sc.nextLine();
		} while (third == "");
		
		if (checkAnagram(another, third))
			System.out.println("'" + another + "' y '" + third + "' son anagramas");
		else
			System.out.println("'" + another + "' y '" + third + "' no son anagramas");
		
		pressKey(sc);
		
		System.out.println("**** ISOGRAMAS: palabras donde cada letra aparece solamente una vez. ****");		
		String isogram = null;
		do {
			System.out.println("Dime una palabra y comprobare si es un isograma: ");
			isogram = sc.nextLine();
		} while (isogram == "");

		
		if (isIsogram(isogram))
			System.out.println("'" + isogram + "' es un isograma");
		else
			System.out.println("'" + isogram + "' no es un isograma");
		
		pressKey(sc);
		System.out.println("Que tengas un buen dia. ¡Gracias por tu tiempo!");
		sc.close();

	}

}
