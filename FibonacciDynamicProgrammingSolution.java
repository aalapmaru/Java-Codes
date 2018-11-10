import java.util.*;


class Fibo{

	int memo[]=new int[100];
	static int calculate(int n) {

		int memo[]=new int[100];
		for(int i=0;i<memo.length;i++) {
			memo[i]=-1;
		}

		if(memo[n]==-1) {


			if(n<=1)
				memo[n]=n;

			else
				memo[n]=calculate(n-1)+calculate(n-2);

		}

		return memo[n];	

	}

}

public class FibonacciDynamicProgrammingSolution {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		Fibo f=new Fibo();
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int result=	f.calculate(n);

		System.out.println("Result: "+result);





	}


}


