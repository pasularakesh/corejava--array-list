package comspark.info.method.taking.asarray.parameters;

public class ArrayDemo1 {
	void display(char[] temp) {
		for(char x:temp) {
			System.out.println(x);
			
		}
	}

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		double[] arr= {'a','b','c','d'};
		ad.display(arr);
		
		

	}

}
