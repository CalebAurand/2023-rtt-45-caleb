package hibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="movies") //telling the employee object maps to the employees table
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "year_released")
	private Integer yearReleased;
	
	@Column(name = "rating", columnDefinition="decimal", precision = 10, scale = 1)
	private Double rating;
	
	@Column(name = "rental_price", columnDefinition="decimal", precision = 10, scale = 2)
	private Double rentalPrice;
	
	@Column(name = "late_fee", columnDefinition="decimal", precision = 10, scale = 2)
	private Double lateFee;
	
/*examples for relationships*/
	@ToString.Exclude
	@OneToMany(mappedBy = "movie", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<MovieRental> movieRentals;
//	
//	
	
}
