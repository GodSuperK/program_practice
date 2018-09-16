/**
 * A Simple Calculator.
 * @version 1.0
 * @author GodSuperK
 */

import java.util.Scanner;

class CalculatorTest {
    private static int COUNT = 1;
    private static String firstPrompt = "What is the first number? ";
    private static String secondPrompt = "What is the second number? ";
    private static String prompt = firstPrompt;

    private static boolean isNumber(String s) {
 	try {
	    Integer.parseInt(s);
	    return true;
	
	}catch (NumberFormatException e) {
	    return false;
	}
    }

    public static int revertInt(Scanner in) {
	String s = null; 
	switch (COUNT) {
	    case 1:
		prompt = firstPrompt;	
		COUNT++;
		break;
	    case 2:
		prompt = secondPrompt;
		COUNT--;
		break;
	    default:
		break;
	}
	while (s == null || isNumber(s) == false || Integer.parseInt(s) < 0) {
	    System.out.print(prompt);
	    s = in.nextLine().trim();
	}
	int aN = Integer.parseInt(s);
	return aN;
    }

    public static int plus(int a, int b) {
	return a+b;	
    }

    public static int substract(int a, int b) {
	return a-b;	
    }

    public static int multiply(int a, int b) {
	return a*b;	
    }

    public static int divide(int a, int b) {
	return a/b;	
    }
 
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = revertInt(in);
	int b = revertInt(in);
	System.out.println(""+a+"+"+b+"="+plus(a,b)+"\n");
	System.out.println(""+a+"-"+b+"="+substract(a,b)+"\n");
	System.out.println(""+a+"*"+b+"="+multiply(a,b)+"\n");
	System.out.println(""+a+"/"+b+"="+divide(a,b));

    }

}
