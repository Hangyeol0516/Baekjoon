import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if (a>b&&a<c || a<b&&a>c) System.out.println(a);
			if (b>a&&b<c || b<a&&b>c) System.out.println(b);
			if (c>a&&c<b || c<a&&c>b) System.out.println(c);
	}
	
}