package assignmennt1;

import java.util.Scanner;

public class fibanacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int firstNumber=0,secondNumber=1,n3,i;    
		 System.out.print(firstNumber+" "+secondNumber);
		    
		 for(i=2;i<n;++i)
		 {    
		  n3=firstNumber+secondNumber;    
		  System.out.print(" "+n3);    
		  firstNumber=secondNumber;    
		  secondNumber=n3;

	}

}
}
