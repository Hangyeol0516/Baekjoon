import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		BigInteger a,b;
		
		a = scan.nextBigInteger();
		b = scan.nextBigInteger();
		
		System.out.println(a.add(b));
	}

}
