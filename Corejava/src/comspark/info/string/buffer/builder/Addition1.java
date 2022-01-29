package comspark.info.string.buffer.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition1 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=   new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first number");
		String s1=br.readLine();
		int fno=Integer.parseInt(s1);
		System.out.println("enter second number:");
		int sno=Integer.parseInt(br.readLine());
		System.out.println("result:"+(fno+sno));
	}

				
		

	}



