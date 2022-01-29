package comspark.info.method.taking.objects;

public class Student1 {
	int rollNo=123, m1=60,m2=70,m3=80;
}

class ObjectDemo{
	void calculate(Student stu) {
		System.out.println(stu.rollNo);
		int sum=stu.rollNo+stu.rollNo+stu.rollNo;
		System.err.println(sum);
		int avg=sum/3;
		System.out.println(avg);
		
	}

	
    public static void main(String[] args) {
    	Student st=new Student();
    	ObjectDemo od = new ObjectDemo();
    	od.calculate(st);
    	
    	 }
    	
    }
 

	


