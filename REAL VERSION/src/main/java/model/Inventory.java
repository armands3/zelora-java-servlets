package model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "inventory", schema = "zelora")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inventory implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "inventory_id")
    private Integer inventoryId;
   
    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;
   
    @Column(name = "quantity_reserved")
    private Integer quantityReserved;
   
    @Column(name = "reorder_point")
    private Integer reorderPoint;
   
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne
    @ToString.Exclude
    private Product productId;
    
    @JoinColumn(name = "supplier_id", referencedColumnName = "supplier_id")
    @ManyToOne
    @ToString.Exclude
    private Supplier supplierId;

       
}