/*
 * Created on 2022-05-06 ( 17:51:46 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package backend.backend.persitence.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "CartItem"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name = "Cart_Item", schema = "dbo", catalog = "shop")
@IdClass(CartItemId.class)
public class CartItem implements Serializable {

    private static final long serialVersionUID = 1L;

    // --- ENTITY PRIMARY KEY
    @Id
    @Column(name = "id_customer", nullable = false)
    private Integer idCustomer;

    @Id
    @Column(name = "id_product", nullable = false)
    private Integer idProduct;

    // --- ENTITY DATA FIELDS
    @Column(name = "quantity")
    private Integer quantity;

    // --- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer", insertable = false, updatable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id_product", insertable = false, updatable = false)
    private Product product;

    /**
     * Constructor
     */
    public CartItem() {
        super();
    }

    // --- GETTERS & SETTERS FOR FIELDS
    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdCustomer() {
        return this.idCustomer;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getIdProduct() {
        return this.idProduct;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    // --- GETTERS FOR LINKS
    public Customer getCustomer() {
        return this.customer;
    }

    public Product getProduct() {
        return this.product;
    }

    // --- toString specific method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(idCustomer);
        sb.append("|");
        sb.append(idProduct);
        sb.append("|");
        sb.append(quantity);
        return sb.toString();
    }

}
