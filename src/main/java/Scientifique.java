import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Scientifique {
		
	public static void run() {
		String menuSci = "cos : cosinus\n"
				+ "sin : sinus\n"
				+ "pow : puissance\n"
				+ "c : opérations classiques";
		
		Scanner sc = new Scanner(System.in);
		String op= "";
		System.out.println(menuSci);
		double x,y;
		op = sc.nextLine();
		switch(op) {
		case "cos" :
			System.out.println("Entrez opérande :");
			x= sc.nextDouble();
			System.out.println(cos(x));
			break;
		case "sin" :
			System.out.println("Entrez opérande :");
			x = sc.nextDouble();
			System.out.println(sin(x));
			break;
		case "pow" :
			System.out.println("Entrez la première opérande :");
			x = sc.nextDouble();
			System.out.println("Entrez la deuxième opérande :");
			y = sc.nextDouble();
			System.out.println(pow(x,y));
			break;
		case "c":
			Classique.run();
			break;
		default:
			System.out.println("Veuillez choisir une opÃ©ration valide");
			break;	
		}
		sc.close();
	}
	
	static double cos(double x) {
		return Math.cos(x);
	}
	static double sin(double x) {
		return Math.sin(x);
	}
	static double pow(double x, double y) {
		return Math.pow(x, y);
	}
	
	
}
