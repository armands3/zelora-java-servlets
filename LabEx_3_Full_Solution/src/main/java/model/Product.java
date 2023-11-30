package model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product implements Serializable {

  
    @Id
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    
    @Column(name = "product_name")
    private String productName;
   
    @Lob
    @Column(name = "description")
    private String description;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private BigDecimal price;
   
    @Column(name = "size")
    private String size;
   
    @Column(name = "colour")
    private String colour;
   
    @Column(name = "material")
    private String material;
    
    @Column(name = "sustainability_rating")
    private Integer sustainabilityRating;
    
    @Column(name = "manufacturer")
    private String manufacturer;
   
    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    
    @Column(name = "discounted_price")
    private BigDecimal discountedPrice;
    
    @Basic(optional = false)
    @Column(name = "feature_image")
    private String featureImage;
   
    @OneToMany(mappedBy = "productId")
    @ToString.Exclude
    private List<Orderitem> orderitemList;
    
    @OneToMany(mappedBy = "productId")
    @ToString.Exclude
    private List<Review> reviewList;
   
    @OneToMany(mappedBy = "productId")
    @ToString.Exclude
    private List<Wishlist> wishlistList;
   
    @OneToMany(mappedBy = "productId")
    @ToString.Exclude
    private List<Inventory> inventoryList;
   
    @JoinColumn(name = "supplier_Id", referencedColumnName = "supplier_id")
    @ManyToOne(optional = false)
    @ToString.Exclude
    private Supplier supplierId;
   
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne
    @ToString.Exclude
    private Category categoryId;

}