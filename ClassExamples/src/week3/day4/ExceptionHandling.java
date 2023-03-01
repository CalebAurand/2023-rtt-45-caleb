package week3.day4;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling eh = new ExceptionHandling();
		ArrayLibrary al = new ArrayLibrary();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//sample input from hacker rank problem on exception handling
//		3 5
//		2 4
//		0 0
//		-1 -2
//		-1 3
		try {
			System.out.println(eh.power(3, 5));
			System.out.println(eh.power(2, 4));
			System.out.println(eh.power(0, 0));
			System.out.println(eh.power(-1, -2));
			System.out.println(eh.power(-1, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.getMessage();
			e.printStackTrace();
		}
		
		//custom created exceptions, with exception handling
		try {
			numbers = al.insertElement(numbers, -1, 9);
			al.printArray(numbers, "new array presented");
		} catch (NegativePositionException npe) {
			System.out.println("Negative Position Exception " + npe.getMessage());
			npe.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			// this is where you would do cleanup, garbage collection, etc
			// an ex. of what goes here... closing a scanner scan.close()
			System.out.println("This code will be executed in either case, no matter what.");
			System.out.println("Resources cleaned up");

		}
		
		try {
			numbers = al.insertElement(numbers, 30, 11);
		} catch (Exception e) {
			System.out.println("*******An exception has occurred********");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public long power(int a, int b)throws Exception{
		if( a < 0 || b < 0){throw new Exception("n or p should not be negative.");}
		if(a == 0 && b == 0){throw new Exception("n and p should not be zero.");}
		
		
		return (long) Math.pow(a, b);
	}

}
