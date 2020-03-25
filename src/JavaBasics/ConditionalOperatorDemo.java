package JavaBasics;

public class ConditionalOperatorDemo {

	public static void main(String[] args) {

		int x = 30;
		int y = 28;
		
		String s = (x==y) ? "x equals to y" : "x not equals to y";
		System.out.println(s);
		
		boolean b = (x==y) ? true : false;
		System.out.println(b);
		
		int i = (x>y) ? x : y;
		System.out.println(i);


	}

}
