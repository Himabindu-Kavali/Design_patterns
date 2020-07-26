package Structural_Adapter;

public class AdapterPat {
	public static void main(String args[]){  
		  Credit targetInterface=new BankCust();  
		  targetInterface.giveBankDetails();  
		  System.out.print(targetInterface.getCreditCard());  
		 }   
}
