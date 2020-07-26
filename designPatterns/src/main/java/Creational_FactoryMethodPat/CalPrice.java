package Creational_FactoryMethodPat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalPrice 
{
	public static void main(String args[])throws IOException
	{
		SelectChoc choco_type = new SelectChoc();
		System.out.print("Available chocolates are:\nDairy Milk\nKitKat\n");
		System.out.print("Enter the name of the chocolate: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choco_name=br.readLine();  
	    System.out.print("Enter the number of chocolates: ");
	    int no_of_choco=Integer.parseInt(br.readLine());
	    Choc c = choco_type.ChocoType(choco_name);
	    System.out.print("Total cost for "+no_of_choco+" "+choco_name+"s is: ");
	    c.getPrice();
	    c.calculateCost(no_of_choco);
	}

}
