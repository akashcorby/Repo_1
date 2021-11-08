package Java_Traning;

public class Sandeep_Adopted_Child extends Sandeep
{
	public void LoveMusic()
	{
		System.out.println("Adopted Child love Music");
	}
	
	 public void Awww()//method
	    {
	    	System.out.println("Sandeep_Adopted_Child Sleep too much");
	    }
	public static void main(String[] args) 
	{
		Sandeep s = new Sandeep_Adopted_Child();//Upcasting// Fruit f = new mango();//upcasting
		System.out.println(s.age);              //                    
		System.out.println(s.food="Lassi");
		System.out.println(s.height=9.0);                     //  mango m = (mango)f;//downcasting
	    s.Awww();
	    s.restaurant("Paw");
	    
	    
	    
	    //s.LoveMusic();// Compiler Error
	    
	    ((Sandeep_Adopted_Child)s).LoveMusic();//DownCasting
		
		Sandeep_Adopted_Child a = (Sandeep_Adopted_Child)s;//DownCasting
		a.restaurant("pizza");
		a.Awww();
		a.LoveMusic();
	}

}
