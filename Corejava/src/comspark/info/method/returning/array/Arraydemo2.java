package comspark.info.method.returning.array;

public class Arraydemo2 {
	double add(double[] abc) {
		double sum=0.0;
		for(double x:abc) {
			sum=sum+x;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		double[] arr= {1.1,2.2,3.3,4.4};
		double res=ad.add(arr);
		System.out.println(res);

	}

}
