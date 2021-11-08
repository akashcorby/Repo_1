package Java_Traning;

public class SandeepChild extends Sandeep//Inheritance
{
	int ag;//Instance variable
	
	SandeepChild(int ag)//Constructor
	{
		super(ag);//this,super//this(),super()// Super class alwalys call the parent class constructor
		this.ag=ag;// it will only invoke current class instance variable//  this.   super.
		System.out.println("BBBBBBBBBBBBBBBBBBBB");
	}
	
	@Override
	public void Best_friend()//method overriding
	{
		System.out.println("SandeepChild sleep too much");
	}
	@Override
	public void eat(int a)
	{
		System.out.println("we eats jdjshdlhs");
	}
	
	public static void main(String[] args) 
	{
		SandeepChild s = new SandeepChild(333);
		System.out.println(s.ag);
		s.Awww();
		s.Best_friend();	
        s.eat(2);
	}

}
