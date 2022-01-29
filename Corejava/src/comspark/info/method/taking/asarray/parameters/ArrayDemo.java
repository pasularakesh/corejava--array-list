package comspark.info.method.taking.asarray.parameters;

public class ArrayDemo {

void display(double[] arr) {
	for(double x:arr) {
				System.out.println(x);
			}
		}
public static void main(String[] args) {
	ArrayDemo ad = new ArrayDemo();
	double arr[]= {1.2,3.4,5.6,7.8};
	ad.display(arr);
	double nos[]= {1.1,2.2,3.3,4.4,5.5};
	ad.display(nos);
	
	
}
	
}

		

	


