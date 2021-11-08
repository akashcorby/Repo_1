package Java_Traning1;

import Java_Traning.Sandeep_Wife;//to access protected member from sandeep_wife class to sandeep_EX girl friend we need import sandeep_wife class

public class Sandeep_EX_Girl_Friend extends Sandeep_Wife//can't able to create ob child class due to final key word
{

	public static void main(String[] args) 
	{
		Sandeep_EX_Girl_Friend g = new Sandeep_EX_Girl_Friend();
	    System.out.println(g.Sandeep_wife_jewellery);
	    System.out.println(g.jewellery_price);

	}

}
