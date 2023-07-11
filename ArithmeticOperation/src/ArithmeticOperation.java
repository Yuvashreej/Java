import java.util.Scanner;
public class ArithmeticOperation {

	public static void main(String[] args) {
		
		 int result=subtractNumber(20,5);
		 int result1=multiplyNumber(4,5);
		 double result2= divideNumber(20,4);
		 int result3= findRemainder(10,3);
		 System.out.println(result);
		 System.out.println(result1);
		 System.out.printf("%.2f\n",result2);
		 System.out.println(result3);
	}
 public static int subtractNumber(int num1,int num2)
{
	return num1-num2;
}
public static int multiplyNumber(int num1,int num2) 
{
	return num1*num2;
}
public static double divideNumber(int num1,int num2) 
{
	return num1/num2;
}
public static int findRemainder(int num1,int num2) 
{
	return num1%num2;
}

}
