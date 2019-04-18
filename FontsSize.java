package gr.aueb.cf;

import java.util.Scanner;

public class FontsSize {

	public static void main(String[] args) {

		int age, fontSize;
		Scanner in = new Scanner(System.in);
		
		System.out.println("parakalv doste ti megaliteri ilikia ton akroaton");
		age = in.nextInt();
		fontSize = FontsSize.findFontsSize(age);
		
		System.out.printf("to mege8os grammatosiras gia %d einai %d",age,fontSize);
		in.close();
	}	
	

	private static int findFontsSize(int age)
	{
		int fontSize = 0;
		final int half = 2;
		fontSize = age/half;
		return fontSize;
		
	}
}
