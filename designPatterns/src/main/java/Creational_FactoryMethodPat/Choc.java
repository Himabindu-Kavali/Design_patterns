package Creational_FactoryMethodPat;

public abstract class Choc {
	protected double price;
    abstract void getPrice();
    public void calculateCost(int no_of_chocolates)
    {
      System.out.println(no_of_chocolates*price);
    }
}
