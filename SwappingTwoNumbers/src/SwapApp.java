import java.util.Scanner;

public class SwapApp {

	public static void main(String[] args) {
     Scanner scan =new Scanner(System.in);
     System.out.println("enter 2 numbers");
     int temp =0;
     int a = scan.nextInt();
     int b = scan.nextInt();
     System.out.println("2 numbers before swapping:"+a+" "+b);
     temp=a;
     a=b;
     b=temp;
     System.out.println("2 numbers after swapping:"+a+" "+b);
   }

}
