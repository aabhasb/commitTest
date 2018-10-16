package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestGumTree {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Runtime rTime = Runtime.getRuntime();
		
		try {
			Process pro;
			BufferedReader is;
			String output;
			
			pro = rTime.exec("D:\\SE_Thesis\\gumtreeEclipse\\gumtree\\dist\\build\\distributions\\gumtree.bat"
					+ " diff"
					+ " D:\\SE_Thesis\\gumtreeEclipse\\gumtree\\dist\\build\\distributions\\1.java"
					+ " D:\\SE_Thesis\\gumtreeEclipse\\gumtree\\dist\\build\\distributions\\2.java");
			is = new BufferedReader(new InputStreamReader(pro.getInputStream()));
			while ((output = is.readLine()) != null)
			{
				System.out.println(output);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

private void hey(){
	System.out.println(output);
	int i=5;
	i++;
	if(i>0){
	System.out.println("hello");
	}
	else {
	System.out.println("bye");
	}
}

}
