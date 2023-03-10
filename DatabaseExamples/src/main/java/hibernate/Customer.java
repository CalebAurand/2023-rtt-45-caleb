package hibernate;

import java.util.ArrayList;
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

@Entity
@Getter
@Setter
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "contact_lastname")
	private String contactLastName;

	@Column(name = "contact_firstname")
	private String contactFirstName;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "country")
	private String country;

	// ****** Error Message: Repeated column in mapping for entity: hibernate
	// customer column
	// this essentially makes this a read only variable in this entity object
	// we add the insertable = flase and updatable = fase because we are using a
	// many to one mapping that is on this same column
	// the other option is to simply delete these two lines for private variable
	@Column(name = "salesRepEmployeeNumber", insertable = false, updatable = false)
	private Integer salesRepEmployeeNumber;

	@Column(name = "credit_limit", columnDefinition = "decimal", precision = 10, scale = 2)
	private Double creditLimit;

	// salesRepEmployeeNumber allows for null values and since this is a forein key
	// we
	// need to set optional = true and nullable = true to tell hibernate that null
	// values are okay
	@ToString.Exclude
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "salesRepEmployeeNumber", nullable = true)
	private Employee employee;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Payment> payments = new ArrayList<Payment>();
	
	@ToString.Exclude
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Order> orders = new ArrayList<Order>();


	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", contactLastName=" + contactLastName
				+ ", contactFirstName=" + contactFirstName + ", phone=" + phone + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state + ", postalCode="
				+ postalCode + ", country=" + country + ", salesRepEmployeeNumber=" + salesRepEmployeeNumber
				+ ", creditLimit=" + creditLimit + "]";
	}

}
