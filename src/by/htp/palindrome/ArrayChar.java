package by.htp.palindrome;

import java.util.Arrays;

/**Template for creating an array of characters
 */
public class ArrayChar {
	private char[] massiv;

	/*public ArrayChar() {
		massiv = new char[1];
	}*/

	public char[] getMassiv() {
		return massiv;
	}

	public void setMassiv(char[] massiv) {
		this.massiv = massiv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(massiv);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayChar other = (ArrayChar) obj;
		if (!Arrays.equals(massiv, other.massiv))
			return false;
		return true;
	}
	
}
