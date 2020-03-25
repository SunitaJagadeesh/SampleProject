package JavaBasics;

public class Pattern {

	public static void main(String[] args) {
		
		int  N=5, i, j, T=0;
		
		for(i=0; i<N; i++)
		{
			for(j=0; j<=i; j++)
			{
				T = T+1;
				System.out.print(T);
			}
			System.out.println();
			T=0;

			
		}

	}

}
