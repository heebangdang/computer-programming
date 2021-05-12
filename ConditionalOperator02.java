package section03;

public class ConditionalOperator02 {

	public static void main(String[] args) {

		int x = 50;
		int y, z;
		if (x > 0)
			y = 1;
		else
			y = -1;
		
		System.out.println(y);
		
		z = x > 0? 1: -1;
		System.out.println(z);
	}
}
