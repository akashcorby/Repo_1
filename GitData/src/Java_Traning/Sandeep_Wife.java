package Java_Traning;

public class Sandeep_Wife extends Sandeep_Child_HW implements Sandeep_Child_Fan,Sandeep_Child_AC//multiple interface//abstract method implementation from interface sandeep_child and Sandeep_Child_AC
{
	protected String Sandeep_wife_jewellery="Tanisq jewellery";
	protected int jewellery_price=200000;
	
	@Override
	public void Switch_ON()
	{
		System.out.println("Fan switch ON kar diya beta");
	}
	public void Switch_OFF()
	{
		System.out.println("Fan switch OFF kar diya beta");
	}
	public void Switch_ON_AC()
	{
		System.out.println("A/C switch ON kar diya beta");
	}
	public void Switch_OFF_AC()
	{
		System.out.println("A/c switch OFF kar diya beta");
	}
	public void HomeWork_Completed()
	{
		System.out.println("Home work completed");
	}
	public void HomeWork_Not_Completed()
	{
		System.out.println("Home work not completed");
	}

	public static void main(String[] args) 
	{
		Sandeep_Wife w = new Sandeep_Wife();
        System.out.println(w.Sandeep_wife_jewellery);
        System.out.println(w.jewellery_price);
	}

}
