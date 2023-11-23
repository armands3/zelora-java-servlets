package model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "wishlist")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Wishlist implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "wishlist_id")
    private Integer wishlistId;

    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Column(name = "wishlist_name")
    private String wishlistName;

    @Lob
    @Column(name = "notes")
    private String notes;

    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne
    @ToString.Exclude
    private Customer customerId;

    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne
    @ToString.Exclude
    private Product productId;


}
