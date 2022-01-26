# corejava--array-list

ArrayListDemo.java

package comspark.info.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("nokia");
		al.add("sony");
		al.add("htc");
		al.add("samsung");
		al.add(3, "motorola");
		System.out.println("list:"+al);
		al.remove("htc");
		al.remove(1);
		System.out.println("list:"+al);
		System.out.println("size:"+al.size());
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}


	}

}
