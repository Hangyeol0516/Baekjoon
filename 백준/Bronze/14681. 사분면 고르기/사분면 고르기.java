import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner( System.in );
		
		int a,b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a>0) {
			if(b>0) {
				System.out.print("1");
			}
			else System.out.print("4");
			
		}
		else if(b<0) {
			System.out.print("3");
		}
		else System.out.print("2");
			
	
		
	}
	
}
