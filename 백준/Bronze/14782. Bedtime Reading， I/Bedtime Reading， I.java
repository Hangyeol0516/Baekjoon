import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
 
		int N = scan.nextInt();
		int result = 0;
		
		for (int i = 1; i <= N; i++) {
			if (N%i==0) {
				result += i;
			}
		}
		System.out.print(result);
	}
}