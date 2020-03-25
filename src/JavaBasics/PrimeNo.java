package JavaBasics;

public class PrimeNo {

	public static void main(String[] args) {
		int no = 13;
		int count =0 ;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i == 0)
				count=count+1;          // count++ also can be used
		}
		if(count == 0)
			System.out.println(no+ " is a Prime Number");
		else
			System.out.println(no+" is not a Primenumber");
	}

}
