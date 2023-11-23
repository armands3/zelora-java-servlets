package model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Orders implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "order_id")
    private Integer orderId;
    
    @Column(name = "order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    
    @Column(name = "order_status")
    private String orderStatus;
    
    @Column(name = "payment_method")
    private String paymentMethod;
    
    @Column(name = "shipping_method")
    private String shippingMethod;
    
    @Column(name = "delivery_date")
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;
    
    @OneToMany(mappedBy = "orderId")
    @ToString.Exclude
    private List<Orderitem> orderitemList;
    
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne
    @ToString.Exclude
    private Customer customerId;
  
}