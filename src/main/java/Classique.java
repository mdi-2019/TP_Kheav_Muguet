import java.util.Scanner;

public class Classique {

	public void run() {
		String menu = "+: addition\n-: soustraction\n*: multiplication\n/: division0: Stop la calculatrice";

		Scanner sc = new Scanner(System.in);
		char c = ' ';
		double a;
		double b;
		System.out.println(menu);
		System.out.println("Choix de l'operation");
		System.out.println("Entrez le premier opérande :");
		a = sc.nextDouble();
		System.out.println("Entrez le second opérande :");
		b = sc.nextDouble();
		c = sc.nextLine().charAt(0);

		switch (c) {
		case ('+'):
			System.out.println("addition");
			System.out.println(this.add(a, b));
			break;
		case ('-'):
			System.out.println("soustraction");
			System.out.println(this.sub(a, b));
			break;
		case ('*'):
			System.out.println("multiplication");
			System.out.println(this.mult(a, b));
			break;
		case ('/'):
			System.out.println("division");
			System.out.println(this.div(a, b));
			break;
		default:
			System.out.println("Veuillez choisir une opération valide");
		}
		sc.close();
	}

	private double add(double a, double b) {
		double result;
		result = a + b;
		return result;
	}
	
	private double sub(double a, double b) {
		double result;
		result = a - b;
		return result;
	}
	
	private double mult(double a, double b) {
		double result;
		result = a * b;
		return result;
	}
	
	private double div(double a, double b) {
		double result;
		result = a / b;
		return result;
	}
	
}
