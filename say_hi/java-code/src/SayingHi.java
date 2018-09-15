/**
 * Just Say Hi
 * @author GodSuperK
 * @version 1.0
 */

import java.util.Scanner;

class SayingHi {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("What is your name? ");
	System.out.printf("Hello,%s,nice to meet you!", in.nextLine());
    }
}
