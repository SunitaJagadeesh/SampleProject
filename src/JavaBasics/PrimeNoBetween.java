package JavaBasics;

public class PrimeNoBetween {

	public static void main(String[] args) {
		
		
		for(int no=1; no<=50; no++)
		{
			int count =0 ;
		

		for(int i=2; i<=no/2; i++)
		{
			if(no%i == 0)
				count=count+1;          // count++ also can be used
		}
		if(count == 0)
			System.out.println(no);
		}	
		

	}

}
