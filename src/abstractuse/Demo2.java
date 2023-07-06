package abstractuse;

public class Demo2 extends demo1 {

	public static void main(String[] args) 
	{
		Demo2 d=new Demo2();
          d.addition();
          d.multiplication();
          d.subtraction();
	}

	@Override
	public void multiplication()
	{
	  int a=5;
	  int b=6;
	  int mul=a*b;
		
	  System.out.println("multiplication is "+mul);
	}

	public void subtraction()
	{
		int a=30;
		int b=20;
		int sub=a-b;
		
		System.out.println("subtraction is "+sub);
				
	}
}
