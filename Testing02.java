package section06;

public class Testing02 {

	public static void main(String[] args) {
		int num = 229231007;
		int[] counts = new int[10];
		while (num > 0) {
		    // pluck off a digit and add to proper counter
		    int digit = num % 10;
		    counts[digit]++;
		    num = num / 10;
		}


	}

}
