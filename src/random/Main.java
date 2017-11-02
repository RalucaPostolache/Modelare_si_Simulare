package random;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n,a,c,m,i;
		double seed1,seed2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("seed1=");
		seed1=scanner.nextDouble();
		System.out.println("seed2=");
		seed2=scanner.nextDouble();
		System.out.println("n=");
		n=scanner.nextInt();
		System.out.println("a=");
		a=scanner.nextInt();
		System.out.println("c=");
		c=scanner.nextInt();
		System.out.println("m=");
		m=scanner.nextInt();
		LCG lcg;
		lcg= new LCG(seed1,n,a,c,m);
		MiddleSquare middleSquare;
		middleSquare= new MiddleSquare(seed2);
		scanner.close();
		for(i=0;i<=10;i++) {
			lcg.next();
		}
		for(i=0;i<=10;i++) {
			middleSquare.next();
		}
	}

}
