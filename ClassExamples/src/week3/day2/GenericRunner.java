package week3.day2;

public class GenericRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass dObj = new DemoClass();
		
		dObj.genericsMethod(25);
		dObj.genericsMethod("Per Scholas");
		dObj.genericsMethod(2563.5);
		dObj.genericsMethod('H');
		
		//initialize generic class from DMultipeDataType class
		//with String and Integer data
		GMultipleDataType<String, Integer> mObj = new GMultipleDataType("Per Scholas", 13);
		
		System.out.println(mObj.getValueOne());
		System.out.println(mObj.getValueTwo());
		
		//initialize generic class, with String and String data
		GMultipleDataType<String, String> mObj2 = new GMultipleDataType("Prior Pteradactyls", "Figurines");
	
		System.out.println(mObj2.getValueOne());
		System.out.println(mObj2.getValueTwo());
	
	}

}
