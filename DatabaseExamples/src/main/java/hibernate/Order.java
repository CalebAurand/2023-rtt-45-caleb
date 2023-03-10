package hibernate;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="customer_id", insertable=false, updatable=false)
	private Integer customerId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "order_date")
	private Date orderDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "required_date")
	private Date requiredDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "shipped_date")
	private Date shippedDate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "comments", columnDefinition = "text")
	private String comments;
	
	@ToString.Exclude
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
}
