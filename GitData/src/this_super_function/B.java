package this_super_function;

public class B extends A
{
	int a;
	String b;
	
    B()
    {
    	//super();
    	super(10);
    	System.out.println("B");
    }
    
    B(int i, String s)
    {
    	//super(i,s);
    	this();
    	a=i;
    	b=s;
    	System.out.println("BB");
    }
    
    public static void main(String[] args) 
    {
		B b = new B();
		B b1 = new B(26,"Sandeep");
		System.out.println("data-->>"+b1.a+","+b1.b);
		
	}
}
