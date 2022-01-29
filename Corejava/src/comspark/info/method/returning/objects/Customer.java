package comspark.info.method.returning.objects;

public class Customer {
	
	int custid=1234;
	String name="pqrs";
}

class ObjectDemo{
	

	public static void main(String[] args) {
		ObjectDemo od = new ObjectDemo();
		Customer c2=od.getObject();
		System.out.println(c2.custid);
		System.out.println(c2.name);
	}
	
	Customer getObject() {
		Customer c1=new Customer();
		 return c1;
		 
		

	}

}
