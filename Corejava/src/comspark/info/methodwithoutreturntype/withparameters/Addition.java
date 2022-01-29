package comspark.info.methodwithoutreturntype.withparameters;

public class Addition {
	void add(double a,double b) {
		double c=a+b;
		System.out.println(c);
		}

	public static void main(String[] args) {
		 Addition ad = new Addition();
		 double x=1.5;
		 double y=1.6;
		 ad.add(x, y);
		 
		}

}
