/**
 * Counting char numbers of String
 * @version 1.0
 * @author GodSuperK
 */
import java.util.Scanner;

class CountingChar {
    public static void main(String[] args) {
	String s = null;
	Scanner in = new Scanner(System.in);
	System.out.print("What is the input string? ");
	s = in.nextLine().trim();
	while (s==null || s.length()==0) {
	    System.out.print("Please input something!");    
	    s = in.nextLine().trim();
	} 
	int c = s.length();
	System.out.printf("%s has %s characters.", s, c);

	
	

    }

}
