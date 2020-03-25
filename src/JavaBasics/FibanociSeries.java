package JavaBasics;

public class FibanociSeries {

	public static void main(String[] args) {
		
		int Num=7, i, a=0, b=1, F;
		
		if (Num==0)
			System.out.println("0");
		else
		{
			System.out.println("1");

		   for(i=0; i<=Num; i++)
		     {
			  F = a+b;
			  a = b;
			  b = F;
			  //F = a+b;
			  System.out.println(F);
			
			
		      }
		}
	}
}
