import java.util.Scanner;

public class ShiftCipherApp{
		public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int shift;
		String message;

		System.out.println("Shift Cipher Algorithm Quiz");
		System.out.println("===========================");
		System.out.println("How many shifts would you want to use? ");
		try {
			shift = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			System.out.println("That is not an integer.");
			System.exit(0);
			return;
		}

		System.out.println("Please enter a message to hit enter to encrypt it.");
		message = sc.nextLine();
		sc.close();

		ShiftCipher app = new ShiftCipher(message, shift);
		app.cipher();
		System.out.println("Encrypted Data: " + app.getCiphered());
		app.decipher();
		System.out.println("Decrypted Data:" + app.getDeciphered());

	}
}