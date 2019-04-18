package gr.aueb.cf;
import java.util.*;

public class DigitsCalc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, i;
		int digits = 0;
		
		System.out.println("Parakalo doste enan ari8mo");
		num = in.nextInt();
		
		i=num;
		
		do {
			i = i/10;
			digits = digits +1;
					
		}while (i!=0);
		
		System.out.printf("To pli8os tvn psifion einai %d",digits);
		in.close();
	}
}	

