package Creational_FactoryMethodPat;

public class SelectChoc {
	public Choc ChocoType(String choco_name)
	{
		if(choco_name==null)
		{
			return null;
		}
		if(choco_name.equalsIgnoreCase("Dairy Milk"))
		{
			return new DairyMilk();
		}
		
		else if(choco_name.equalsIgnoreCase("KitKat"))
		{
			return new Kitkat();
		}
		
		return null;
	}
}
