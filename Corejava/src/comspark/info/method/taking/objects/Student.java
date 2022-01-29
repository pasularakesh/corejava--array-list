package comspark.info.method.taking.objects;

public class Student {
        
	   // public static final int m1 = 0;
		int rollNo=123;
		double marks=78.9;
		String name="abcd";
		
		class ObjectDemo{
			void display(Student stu) {
				System.out.println(stu.rollNo);
				System.out.println(stu.marks);
				System.out.println(stu.name);
				
			}
			public static void main(String[] args) {
				Student st=new Student();
				 ObjectDemo od = new ObjectDemo();
				 
				 od.display(st);
			}
				 
				 
				
			} 
		}

	


