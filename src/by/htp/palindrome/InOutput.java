package by.htp.palindrome;

import java.util.Scanner;
/**Data input-output class
 */

public class InOutput {

	public int amountEl() {
		int amount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		amount = sc.nextInt();
		return amount;
	}

	public String addEl(int amount) {
		String el;
		System.out.println("Enter " + amount + " item");
		Scanner sc = new Scanner(System.in);
		el = sc.nextLine();
		return el;
	}

	public void printFin() {
		System.out.println("");
		System.out.println("Grinko Viktor 10.01.17");
	}

	public void printArr(char[] number) {
		int length;
		length = number.length;
		for (int i = 0; i < length; i++) {
			System.out.print(number[i]);
		}
		System.out.print(" ");
	}

	public void prntWordPalindr() {
		//System.out.println("");
		System.out.println("Palindrome: ");
	}
	public void prntNull(){
		System.out.println("Palindrome not found!!! ");
	}
}
