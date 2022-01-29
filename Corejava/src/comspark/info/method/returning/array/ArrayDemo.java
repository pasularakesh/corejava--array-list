package comspark.info.method.returning.array;

public class ArrayDemo {
	String[] getArray() {
		String[] name={"aaa","bbb","ccc","ddd"};
		return name;
		
	}
	

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		String[] abc=ad.getArray();
		 for(String x:abc) {
			 System.out.println(x);
		 }
	

	}


	public double add(double[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
