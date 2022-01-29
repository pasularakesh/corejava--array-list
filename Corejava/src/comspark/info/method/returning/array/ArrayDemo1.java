package comspark.info.method.returning.array;

public class ArrayDemo1 {
	int[] getArray(){
		int arr[]= {10,20,30,40,50};
		return arr;
		
	}

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		String[]abc=ad.getArray();
		for (String x:abc) {
			System.out.println(x);
		}
		

	}

}
