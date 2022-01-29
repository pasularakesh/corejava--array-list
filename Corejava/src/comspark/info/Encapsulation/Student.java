package comspark.info.Encapsulation;

public class Student {

	
		int rollNo;
		double marks;
		String name;
		void display() {
		System.out.println("roll:" +rollNo);
		System.out.println("marks:" +marks);
		System.out.println("name:"+name);
		}
		public static void main(String[] args) {
			System.out.println("student information");
			Student st = new Student();
			st.display();
		}

}
