import java.util.*;

// Recursive Method

	 class Fibo{
	static int calculate(int n) {
		
		int f;
		if(n<2) {
			return n;
		}
		
		return calculate(n-1)+calculate(n-2);
		
	}
	}
	




public class FibonacciRecursiveSolution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Fibo f=new Fibo();
		System.out.println("Enter the number: ");
		int n=s.nextInt();
	int result=	f.calculate(n);
	
	System.out.println("Result: "+result);
		
		

	}

}
