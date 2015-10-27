package aufgabenblatt3;

public class RecursivePascal {

	public static long COUNT = 0;
	public static long recursivDraw(int n){
		COUNT = 0;
		System.out.print("r :\t");
		for (int r = 0; r <= n; r++){
			System.out.print("(r," +  r + ")" + "\t");
		}
		
		
		for(int r = 0; r <= n; r++){
			System.out.println();
			System.out.print(r + " :\t  ");
			for(int j = 0 ; j <= n; j++ ){
				System.out.print( RecursivePascal.binomialCoef(r,j) + " \t " );
			}
		}
		return COUNT;
	}
	/**
	 * This Function compute the factorial of a number
	 * @param n
	 * @return the factorial of n
	 */
	public static int factorial(int n){
		COUNT++;
		if(n!= 0){
			return n* factorial(n-1);
		}
		return 1;
	}
	
	public static int binomialCoef(int n, int k){ 
		if(n < k){
			return 0;
		}
		return RecursivePascal.factorial(n) / (RecursivePascal.factorial(k)*RecursivePascal.factorial(n-k));
	}
	
	public static void main(String[] args) {
		long counter  = RecursivePascal.recursivDraw(9);
		System.out.println("\nComputing Count : " + counter  );
	}
}
