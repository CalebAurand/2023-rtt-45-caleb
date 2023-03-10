package hibernate;

public class UpdatePaymentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 query the new payment we just created by its id
		// 2 change the check number and the amount
		// 3 update the payment
		
		PaymentDAO paymentDao = new PaymentDAO();
		
		Payment p1 = paymentDao.findById(272);
		
		p1.setCheckNumber("NEWabc123");
		p1.setAmount(2.00);
		paymentDao.updatePayment(p1);
	}

}
