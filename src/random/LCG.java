package random;

public class LCG implements Generator{
	
	int n,  a,  c,  m, nrCifre;
	double seed, newSeed, copieSeed;
	public LCG(double seed,int n, int a, int c, int m) {
		
		this.seed=seed;
		this.a=a;
		this.c=c;
		this.m=m;
	}
	
	public int counter(double seed) {
		copieSeed=seed;
		while(copieSeed>0) {
			copieSeed=copieSeed/10;
			nrCifre++;
		}
		return nrCifre;
	}
	
	@Override
	public double next() {
		newSeed=(a*seed+c)%m;
		if(newSeed==seed) newSeed++;
		seed= newSeed;
		System.out.println("LCG "+ seed);
		return seed/Math.pow(10, nrCifre);
	}

}
