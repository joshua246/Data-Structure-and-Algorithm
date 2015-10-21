public class ShiftCipher {		
	private String origString;
	private String cipherString;
	private String decipheredString;
	private int shift;
	private String getAlphabet() {
		return "abcdefghijklmnopqrstuvwxyz";
	}
	public ShiftCipher(String plain, int shift) {
		this.origString = plain;
		this.shift = shift;
	}


	private char shiftLetter(char origLetter, String type) {
		
		String alphabet = this.getAlphabet();
		int letterPosition = alphabet.indexOf(origLetter);
		char shiftedLetter;
		int ShiftedPosition = 0;
		
		if (type.equals("encrypt")) {
			ShiftedPosition = ((letterPosition + this.shift) % 26);
		} else if (type.equals("decrypt")) {
		
			ShiftedPosition = ((letterPosition - this.shift) % 26);
			if(ShiftedPosition < 0) {
				ShiftedPosition = (ShiftedPosition + 26);
			}
		}
		
		shiftedLetter = alphabet.charAt(ShiftedPosition);
		return shiftedLetter;
	}

	public void cipher() {
		this.origString = this.origString.toLowerCase();
		this.cipherString = "";
		char shiftedLetter;
		
		for(char letter: this.origString.toCharArray()) {
			shiftedLetter = this.shiftLetter(letter, "encrypt");
			this.cipherString += shiftedLetter;
		}
	}

	public String getCiphered() {
		return this.cipherString;
	}

	public void decipher() {
		this.cipherString = this.cipherString.toLowerCase();
		this.decipheredString = "";
		char shiftedLetter;

		for (char letter: this.cipherString.toCharArray()) {
			shiftedLetter = this.shiftLetter(letter, "decrypt");
			this.decipheredString += shiftedLetter;
		}
	}

	public String getDeciphered() {
		return this.decipheredString;
	}
}
