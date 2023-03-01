package week3.day4;

public class ArrayLibraryMain {
	public static void main(String[] args) {
		ArrayLibrary al = new ArrayLibrary();
		int[] numbers = new int[10];

		// 1 - initialize the array with numbers from 1 to 10
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		al.printArray(numbers, "Default initialization");

		// 2 - create a function that will insert a number into the array at a position

		int[] resultArr = new int[numbers.length + 1];
		try {
			resultArr = al.insertElement(numbers, -1, 9);
			al.printArray(resultArr, "new array presented");
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

		// testing for newly created methods
		numbers = al.append(resultArr, 12);
		al.printArray(numbers, "After element append: ");

		numbers = al.delete(numbers, 1);
		al.printArray(numbers, "After element delete at position 1 : ");

		int position = al.findPositionOfValue(numbers, 10);
		System.out.println("The position of value 12 is " + position);

		al.bubbleSort();
	}
}
