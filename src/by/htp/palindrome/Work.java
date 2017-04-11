package by.htp.palindrome;

import by.htp.palindrome.InOutput;
import by.htp.palindrome.ArrayChar;

/**
 * Data processing class
 */
public class Work {
	private int amountEl;
	private InOutput iuPut;
	private ArrayChar[] arrayCh;

	public Work() {
		iuPut = new InOutput();
		// arrayCh = new ArrayChar[25];
	};

	public int getAmountEl() {
		return amountEl;
	}

	public void setAmountEl(int amountEl) {
		this.amountEl = amountEl;
	}

	public InOutput getIuPut() {
		return iuPut;
	}

	public void setIuPut(InOutput iuPut) {
		this.iuPut = iuPut;
	}

	public void createArr() {
		amountEl = iuPut.amountEl();
		arrayCh = new ArrayChar[amountEl];
	}

	/**Create an array of elements
	 */
	public void addElArr() {
		String line;
		int length;
		char ch;
		char[] number;
		for (int i = 0; i < amountEl; i++) {
			line = iuPut.addEl(i + 1);
			length = line.length();
			number = new char[length];
			for (int j = 0; j < length; j++) {
				ch = line.charAt(j);
				number[j] = ch;
			}
			arrayCh[i] = new ArrayChar();
			arrayCh[i].setMassiv(number);
		}
	}

	public void printFin() {
		iuPut.printFin();
	}

	public void printArr() {
		char[] number;
		for (int i = 0; i < amountEl; i++) {
			number = arrayCh[i].getMassiv();
			iuPut.printArr(number);
		}
	}

	public void findPalindr() {
		int length;
		char[] number;
		int amountPal = 0;
		iuPut.prntWordPalindr();
		for (int i = 0; i < amountEl; i++) {
			number = arrayCh[i].getMassiv();
			length = number.length;
			if (length == 1) {
				iuPut.printArr(number);
				amountPal++;
			} else {
				amountPal = amountPal + checkForSymmetry(number);
			}
		}
		if (amountPal == 0) {
			iuPut.prntNull();
		}
	}

	private int checkForSymmetry(char[] number) {
		int length, length2, i, sot = 0, amountPal = 0;
		char[] number1;
		length = number.length;
		length2 = (int) (length / 2);
		number1 = new char[length2];
		i = (length - 1);
		do {
			for (int j = 0; j < length2; j++) {
				number1[j] = number[i];
				i--;
			}

		} while (i > length2);
		for (int k = 0; k < length / 2; k++) {
			if (number[k] == number1[k]) {
				sot++;
			}
		}
		if (sot == length2) {
			amountPal++;
			iuPut.printArr(number);
		}
		return amountPal;
	}
}
