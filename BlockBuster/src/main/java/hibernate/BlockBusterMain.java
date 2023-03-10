package hibernate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BlockBusterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Testing user, movie, movierental
		BlockBusterMain bbm = new BlockBusterMain();
//		bbm.changePassword(3, "abc1234");
		
		User frank = bbm.getUserById(4);
		Movie matrix = bbm.getMovieById(2);
		User Bill = bbm.getUserById(3);
		Movie LOTR = bbm.getMovieById(1);
//		bbm.checkOut(LOTR, Bill);
//		bbm.checkOut(matrix, frank);
//		bbm.checkIn(1, matrix, frank);
		bbm.showMoviesCheckedOut();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dueDate = sdf.parse("2023-03-15");
		
		System.out.println(bbm.calculateLateFee(dueDate, matrix));
	}

	public void changePassword(Integer userId, String password) {
		//create userDAO object
		//find user by userId
		//when found, update user's password to the given string
		//assuming trusted authentication at this point
		UserDAO uDao = new UserDAO();
		User user = uDao.findById(userId);
		user.setPassword(password);
		uDao.updateUser(user);
	}
	
	public User getUserById(Integer userId){
		UserDAO uDao = new UserDAO();
		User user = uDao.findById(userId);
		return user;
	}
	
	public Movie getMovieById(Integer movieId) {
		MovieDAO mDao = new MovieDAO();
		Movie movie = mDao.findById(movieId);
		return movie;
	}
	
	public void checkOut(Movie movie, User user) {
		MovieRentalDAO mRDao = new MovieRentalDAO();
		MovieRental movieRental = new MovieRental();
		movieRental.setUser(user);
		movieRental.setMovie(movie);
		movieRental.setCheckoutDate(new Date());
		mRDao.insert(movieRental);
	}
	
	public void checkIn(Integer rentalId, Movie movie, User user) {
		MovieRentalDAO mRDao = new MovieRentalDAO();
		MovieRental movieRental = mRDao.findById(rentalId);
		movieRental.setUser(user);
		movieRental.setMovie(movie);
		movieRental.setCheckinDate(new Date());
		mRDao.updateMovieRental(movieRental);
	}
	
	public void showMoviesCheckedOut() {
		MovieDAO mDao = new MovieDAO();
		MovieRentalDAO mRDao = new MovieRentalDAO();
		UserDAO uDao = new UserDAO();
		List<MovieRental> movieRentalList = mRDao.getAllMovieRentals();
		
		//result list for checked out movies
		List<Movie> checkedOutList = new ArrayList<Movie>();
		List<User> userList = new ArrayList<User>();
		for(MovieRental m : movieRentalList) {
			if(m.getCheckinDate()==null) {
				Movie movie = mDao.findById(m.getMovieId());
				checkedOutList.add(movie);
				User user = uDao.findById(m.getUserId());
				userList.add(user);				
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Movies Currently Checked Out");
		for(int i=0; i<userList.size(); i++) {
			Movie movie = checkedOutList.get(i);
			User user = userList.get(i);
			System.out.println(movie.getName()+" | checked out by >> " + user.getFirstName() + " " + user.getLastName());

		}
		
	}
	
	public Double calculateLateFee(Date date, Movie movie) {
		Double lateFee = 0.00;
		lateFee = movie.getLateFee();
		if(date.after(new Date())) {
			int diff = (int)getDateDiffDays(new Date(), date);
			
			lateFee *= diff;
			lateFee *=100;
			Math.round(lateFee);
			lateFee /=100;
		}
		return lateFee ;
	}
	
	public long getDateDiffDays(Date date1, Date date2) {
		long diffInMilliseconds = date2.getTime() - date1.getTime();
		return TimeUnit.DAYS.convert(diffInMilliseconds, TimeUnit.MILLISECONDS);
	}
	
}
