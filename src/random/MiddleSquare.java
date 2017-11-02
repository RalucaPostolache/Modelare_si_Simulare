package random;

public class MiddleSquare implements Generator{
	int n;
	double seed, newSeed;
	public MiddleSquare(double seed) {
		this.seed=seed;
	}
	
	
	
	@Override
	public double next() {
		newSeed= ((seed*seed)/Math.pow(10,n/2))%Math.pow(10, n);
		seed=newSeed;
		System.out.println("MiddleSquare "+ seed);
		return seed/Math.pow(10, n);
	}

}
