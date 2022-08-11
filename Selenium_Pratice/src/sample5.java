public class sample5
{
	
	//example with parameter -->single constructor
	
	//step1: declaration
	int num1;    //10, 15
	int num2;
		
	
	
	sample5(int a, int b)   // int , int parameter constructor a=10, b=15
	{
		num1 = a;         //assign local variable info to global variable
		num2 = b;		
	}
	
		
	public void addition()
	{
		int c= num1+num2;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) 
	{
		
		sample5 s5=new sample5(30,40);
		s5.addition();
		
		sample5 s55=new sample5(5,6);
		s55.addition();
		System.out.println("----------------------");
		
		
		
	}
	
}