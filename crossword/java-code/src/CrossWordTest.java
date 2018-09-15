/**
 * This is a crossword app. 
 */

import java.util.Scanner;

class CrossWordTest {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a noun: ");
	String noun = in.next();
	System.out.print("Enter a verb: ");
	String verb = in.next();
	System.out.print("Enter a adjective: ");
	String adjective = in.next();
	System.out.print("Enter a adverb: ");
	String adverb = in.next();
	System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
	System.out.println("\nDo you averb your aadjective anoun aadverb? That's hilarious!".replace("averb", verb).replace("aadjective", adjective).replace("anoun", noun).replace("aadverb",adverb));
    }
}
