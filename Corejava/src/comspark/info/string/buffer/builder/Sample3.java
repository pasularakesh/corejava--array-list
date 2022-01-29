package comspark.info.string.buffer.builder;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

StringBuffer sb = new StringBuffer("java");
System.out.println(sb.append("program").insert(0,"core").delete(4,8).append("test").replace(4,8,"frog").substring(7).
		concat("example").substring(4).replace('e','n').toUpperCase().charAt(8));



	}

}
