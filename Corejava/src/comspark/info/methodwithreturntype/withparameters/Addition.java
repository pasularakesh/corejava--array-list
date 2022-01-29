package comspark.info.methodwithreturntype.withparameters;

public class Addition {
	double add(double a,double b) {
		double c=a+b;
		return c;
		
		
	}

	public static void main(String[] args) {
		Addition ad= new Addition();
		double res=ad.add(2.3, 4.5);
		System.out.println(res);
	

	}

}
