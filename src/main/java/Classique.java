import java.util.Scanner;

public class Classique {

	public static void run() {
		String menu = "+: addition\n-: soustraction\n*: multiplication\n/: division\n0: Stop la calculatrice";

		Scanner sc = new Scanner(System.in);
		char c = ' ';
		double a;
		double b;
		System.out.println(menu);
		System.out.println("Choix de l'operation");
		c = sc.nextLine().charAt(0);
		System.out.println("Entrez le premier opérande :");
		a = sc.nextDouble();
		System.out.println("Entrez le second opérande :");
		b = sc.nextDouble();

		switch (c) {
		case ('+'):
			System.out.println("addition");
			System.out.println(add(a, b));
			break;
		case ('-'):
			System.out.println("soustraction");
			System.out.println(sub(a, b));
			break;
		case ('*'):
			System.out.println("multiplication");
			System.out.println(mult(a, b));
			break;
		case ('/'):
			System.out.println("division");
			System.out.println(div(a, b));
			break;
		default:
			System.out.println("Veuillez choisir une opération valide");
		}
		sc.close();
	}

	static double add(double a, double b) {
		double result;
		result = a + b;
		return result;
	}
	
	static double sub(double a, double b) {
		double result;
		result = a - b;
		return result;
	}
	
	static double mult(double a, double b) {
		double result;
		result = a * b;
		return result;
	}
	
	static double div(double a, double b) {
		double result;
		result = a / b;
		return result;
	}
	
}
