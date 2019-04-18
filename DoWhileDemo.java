package gr.aueb.cf;
import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		
		do {
			DoWhileDemo.menu();
			num = in.nextInt();
			if (num == 0);
			else if (num == 1) System.out.println("Eisagogi Epafis");
			else if (num == 2) System.out.println("Diagrafi epafis");
			else if (num == 3) System.out.println("enimerosi epafis");
			else System.out.println("Doste epiloges apo 0 ews 3");
			
		} while (num !=0);
		
		System.out.println("Euxaristoume! Geia sas");
		in.close();
		
	}


		private static void menu() {
			System.out.println("Epiloges ");
			System.out.println("0 exodos");
			System.out.println("1 eisagogi");
			System.out.println("2 diagrafi");
			System.out.println("3 enimerosi");
			System.out.print("Parakalo doste tin epilogi sas");
			
			
		}
			
	}