package model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;
    
    @Column(name = "category_name")
    private String categoryName;
   
    @Column(name = "category_image")
    private String categoryImage;
    
    @OneToMany(mappedBy = "categoryId")
    @ToString.Exclude
    private List<Product> productList;   

}