import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
         int a = scan.nextInt();
         int b = scan.nextInt();
         int c = scan.nextInt();
         
         if (a==b && b==c) {
        	 System.out.println("Equilateral");
         } else if (a+b+c == 180) {
        	 if (a==b || b==c || a==c) {
        		 System.out.println("Isosceles");
        	 }
        	 
        	 if (a!=b && b!=c && a!=c) {
        		 System.out.println("Scalene");
        	 }
         } else if (a+b+c != 180) {
        	 System.out.println("Error");
         }
        
    }
}