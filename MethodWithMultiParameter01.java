package section05;

public class MethodWithMultiParameter01 {

	public static void main(String[] args) {
        nPrintln("Welcome to Java", 3);
        nPrintln("Computer Science", 7);
	}
	
	public static void nPrintln(String message, int n) {  
		  for (int i = 0; i < n; i++)
		    System.out.println(message);
	}


}
