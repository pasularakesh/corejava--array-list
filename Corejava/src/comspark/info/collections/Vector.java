package comspark.info.collections;

import java.util.ListIterator;

public class Vector {
	private static String X;
	

	@SuppressWarnings("removal")
	public static void main(String[] xyz) {
		 Vector v = new Vector();
		 v.add(new Integer(11));
		 v.add(new Integer(22));
		 v.add(new Integer(33));
		 v.add(44);
		 v.add(55);
		 v.add(66);
		 v.add(1);
		 System.out.println("List:"+v);
		 v.remove(new Integer(22));
		 
		 v.remove(1);
		 System.out.println("List using for loop:");
		 for(int i=0;i<v.size();i++) {
			 System.out.println(v.get(i)+"");
		 }
		 System.out.println("\nList using for each loop:");
		
		 for(int x: v) {
			 System.out.println(x+"");
			 }
		 
		 @SuppressWarnings("rawtypes")
		ListIterator lit=v.listIterator();
		 System.out.println("\nforward direction");
		 
		 while(lit.hasNext()) {
			 System.out.println(lit.next()+"");
			 
		 }
		 System.out.println("\nbackward direction: ");
		 while(lit.hasPrevious()) {
			 System.out.println(lit.hasPrevious()+"");
		 }
		 
				 
		

	}


	private ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}


	private String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	private int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	private void remove(Integer integer) {
		// TODO Auto-generated method stub
		
	}


	private void add(Integer integer) {
		// TODO Auto-generated method stub
		
	}

	

	
}
