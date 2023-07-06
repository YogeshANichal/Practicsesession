package controlStatements;

public class Staticmethodwithparameteror {

	public static void main(String[] args) {
		
     test();
     Staticmethodwithparameteror k=new Staticmethodwithparameteror();
	 k.addition(1, 2, 3, 4);
	 k.addition(45,56,67,89);
	 k.subtraction(78, 34, 12, 12);	
	 k.subtraction(45, 5, 5, 5);
		division(24,12);
	}
    public static void test()
 {
    String name="yogesh";
    char division='k';
    int marks=550;
    boolean status=true;
    
    System.out.println("my name is "+name);
    System.out.println("my division is "+division);
    System.out.println("my marks are "+marks);
    System.out.println("my status is "+status);
 }
    public void addition(int a,int b,int c,int d)
 {
      int sum;
      sum=a+b+c+d;
    System.out.println("total addition is "+sum);
 }
    public void subtraction(int p,int q,int r,int s)
 { 
    int sub;
    sub=p-q-r-s;
    
    System.out.println("subtraction is "+sub);
 }
    public static void division(int k,int y)
    
    { 
    	int div;
    	
    	div=k/y;
    	
    	System.out.println("division is "+div);
    }
    
}
