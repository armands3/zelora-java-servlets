package model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "orderitems")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Orderitem implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "order_item_id")
    private Integer orderItemId;
   
    @Column(name = "quantity")
    private Integer quantity;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "item_price")
    private BigDecimal itemPrice;
   
    @Column(name = "subtotal")
    private BigDecimal subtotal;
   
    @Column(name = "item_weight")
    private BigDecimal itemWeight;
   
    @Lob
    @Column(name = "customisation_options")
    private String customisationOptions;
   
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    @ManyToOne
    @ToString.Exclude
    private Orders orderId;
    
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne
    @ToString.Exclude
    private Product productId;

    
}
