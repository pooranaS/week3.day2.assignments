package week3.day2.assignments.mandatory;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		int count=0;
		
		String[] textArr = text.split(" ");
		
		for(int i=0;i<textArr.length;i++)
		{
			for(int j=i+1;j<textArr.length;j++)
			{
				if(textArr[i].equals(textArr[j]))
				{
					count++;
					//System.out.println("count:"+count);
				
				if (count > 0) {
					textArr[i] = "";
					textArr[j] = "";
				}
				}
			}
		}
		System.out.println("String without duplicates");
		for(String eachArr:textArr)
		{
			System.out.println(eachArr);
		}
		
	}

}
