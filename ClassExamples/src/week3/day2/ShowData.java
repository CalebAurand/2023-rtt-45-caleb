package week3.day2;

import java.util.ArrayList;

public class ShowData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDataToArrayList b = new AddDataToArrayList();
		ArrayList<Book> mybooklist = b.bookDetails();
		for(Book showValue : mybooklist) {
			//invoking the getter method for getting data
			System.out.println(showValue.getNumber() + " " + showValue.getName() + " "
					+ showValue.getCategory() + " " + showValue.getAuthor());		}
	}

}
