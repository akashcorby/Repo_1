package this_super;

public class B extends A
{
  String s = "Child";
  
  void print()
  {
	  System.out.println(s);
	  System.out.println(this.s);
	  System.out.println(super.s);
  }
  
  public static void main(String[] args) 
  {
	B b = new B();
	b.print();
  }
}
