import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c=' ';
		while(true) {
			System.out.println("Choisir le mode : (c)lassique | (s)cientifique");
			c = sc.nextLine().charAt(0);
			if (c=='c') {
				Classique.run();
				break;
			}
			else if (c=='s') {
				Scientifique.run();
				break;
			}
		}
		sc.close();

	}
}
