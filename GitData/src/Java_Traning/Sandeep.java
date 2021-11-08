package Java_Traning;

public class Sandeep 
{
	//___________________instance variable________________________
    int age;
    String name;
    double height;
    String WebSeries;
    String food;
    int price;
   //_____________________constructor______________________________//initialization of instance variable____________
    
    Sandeep()//Non-parameterized constructor// constructor overloading //constructor don'nt have any return type not even void
    {
    	age=25;
    	name="SW";
    }    
    Sandeep(int age)//parameterized constructor
    {
    	this.age=age;//age=26//  age=x;
    	System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA "+age);
    }  
    Sandeep(int a, double h)//parameterized constructor
    {
    	//this(a);
    	age=a;
    	name="Sandeep wable";//this()  or super()
    	height=h;
    }
   //________________________methods_______________________________ 
    
    public void Awww()//method
    {
    	System.out.println("Sandipwaaa!!! Sleep too much ");
    }
    
	public void Sandeep_WebSeries(String WebSeries)//method
	{
		this.WebSeries=WebSeries;
		System.out.println(WebSeries+ " Webserise dekhta hain launda ");
	}
	//____________method overloding__________________________________ 
	public void restaurant(String food)//method overloading
	{
		this.food=food;
		System.out.println(food+ " khata hai launda ");
	}
	
	public void restaurant(String food, int price)//method overloading
	{
		this.food=food;
		this.price=price;
		System.out.println(food+ " khata hai launda or uska price hai "+price);
	}
	
	public void Best_friend()//method
	{
		System.out.println("James bond 007  sandeep wable   best friend");
	}
	
	public void eat(int a)
	{
		System.out.println("we eats");
	}
	public void eat(int b, String s)
	{
		System.out.println("we eats both");
	}
    
	//__________________main method____________________________________
		
	public static void main(String[] args) //main()
	{
	  Sandeep s1 = new Sandeep();
	  System.out.println(s1.age+" "+s1.name);
	  
	  Sandeep s2 = new Sandeep(26);
 	  System.out.println(s2.age);
 	  	  
      Sandeep s3 = new Sandeep(27,5.4);
      System.out.println(s3.age+" , "+s3.name+" , "+s3.height);
      
      Sandeep s4 = new Sandeep();
      s4.Best_friend();
      
      Sandeep s5 = new Sandeep();
      s5.Awww();
      
      Sandeep s6 = new Sandeep();
      s6.Sandeep_WebSeries("Ashram");
      
      Sandeep s7 = new Sandeep();
      s7.restaurant("Chiken Biriyani");
      s7.restaurant("Amul kulfi", 20);
      
      
	}

}
