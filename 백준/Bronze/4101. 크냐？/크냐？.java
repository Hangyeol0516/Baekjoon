import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int a,b;
			
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			if(a==0&&b==0) {
				break;
			}
			if(a>b) {
				System.out.println("Yes");
			}
			else System.out.println("No");
		}
			
	}
	
}