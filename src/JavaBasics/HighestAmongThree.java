package JavaBasics;

public class HighestAmongThree {

	public static void main(String[] args) {
		
		int a = 40;
		int b = 0;
		int c = 4;
		
		if(a>b && a>c)
			System.out.println(a+ " is greater");
		else if (b>a && b>c)
			System.out.println(b+ " is greater");
		else if (c>a && c>b)
		    System.out.println(c+ " is greater");
		else 
		    System.out.println("2 or more values are same");



	}

}
