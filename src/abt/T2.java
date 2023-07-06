package abt;

public class T2 extends T1{

	public static void main(String[] args) 
	{
		T2 t=new T2();
		t.test1();
		
		t.test2();
		
		t.test3();

	}

	@Override
	public void test2()
	{
      System.out.println("test2 method from t1 class but complete in test 2 class");
		
	}

	public void test3()
	{
	  System.out.println("test 3 own method from t2 class");
	}
}
