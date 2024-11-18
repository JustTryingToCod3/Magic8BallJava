package school;

import java.util.*;
public class RandomGame {
	public static void main(String [] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Ask the magic 8 ball a yes or no question! ");
		String input = in.nextLine();
		System.out.println("Your Question: " + input); 
		
		int r = rand.nextInt(5)+1;
		
		if (r==0) {
			System.out.println("NO!");
		}
		else if (r==1) {
			System.out.println("It is possible");
		}
		else if (r==2) {
			System.out.println("We'll see...");
		}
		else if (r==3) {
			System.out.println("Absolutely Not!");
		}
		else if (r==4) {
			System.out.println("100% YESSSSS");
		}
		else if (r==5) {
			System.out.println("Yes!");
		}
		
		while(true) {
			System.out.println("Would You like to ask again? [y/n]");
			String inputt = in.nextLine();
			inputt.trim();
			
			if (inputt.equalsIgnoreCase("n")) {
				System.out.println("Exiting Now");
				break;
			}
			else {
				
			}
			
			System.out.println("Ask the magic 8 ball a yes or no question! ");
			String Input = in.nextLine();
			System.out.println("Your Question: " + Input);
			
			int ra = rand.nextInt(5)+1;
			
			if (ra==0) {
				System.out.println("NO!");
			}
			else if (ra==1) {
				System.out.println("It is possible");
			}
			else if (ra==2) {
				System.out.println("We'll see...");
			}
			else if (ra==3) {
				System.out.println("Absolutely Not!");
			}
			else if (ra==4) {
				System.out.println("100% YESSSSS");
			}
			else if (ra==5) {
				System.out.println("Yes!");
			}
		}
	in.close();
	}
	

}
