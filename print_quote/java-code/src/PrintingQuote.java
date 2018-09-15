/**
 * Printing quote
 * @version 1.0
 * @author GodSuperK
 */
import java.util.Scanner;

class PrintingQuote {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("What is the quote? ");
	String quote = in.nextLine();
	System.out.print("Who said it? ");
	String author = in.nextLine();
	System.out.println(""+author+"says,"+"\""+quote+"\"");
    }

}
