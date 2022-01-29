package comspark.info.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(50);
		s.push(20);
		s.push(40);
		s.push(60);
		s.push(10);
		s.push(30);
		System.out.println("List:"+s);
		System.out.println(s.pop());
		System.out.println("List:"+s);
		System.out.println(s.peek());
		System.out.println("List:"+s);
		

	}

}
