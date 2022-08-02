/*
 * Created on 2022-05-06 ( 17:51:47 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package backend.backend.persitence.entities;

import java.io.Serializable;

import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Sale"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Sale", schema="dbo", catalog="shop" )
public class Sale implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_sale", nullable=false)
    private Integer    idSale ;

    //--- ENTITY DATA FIELDS 
    @Column(name="sale_condition", length=50)
    private String     saleCondition ;

    @Column(name="discount_kind", length=50)
    private String     discountKind ;

    @Column(name="discount_condition", length=50)
    private String     discountCondition ;

    @Column(name="discount_value")
    private Double discountValue ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="sale")
    private List<Voucher> listOfVoucher ; 

    @OneToMany(mappedBy="sale")
    private List<Promote> listOfPromote ; 


    /**
     * Constructor
     */
    public Sale() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setIdSale( Integer idSale ) {
        this.idSale = idSale ;
    }
    public Integer getIdSale() {
        return this.idSale;
    }

    public void setSaleCondition( String saleCondition ) {
        this.saleCondition = saleCondition ;
    }
    public String getSaleCondition() {
        return this.saleCondition;
    }

    public void setDiscountKind( String discountKind ) {
        this.discountKind = discountKind ;
    }
    public String getDiscountKind() {
        return this.discountKind;
    }

    public void setDiscountCondition( String discountCondition ) {
        this.discountCondition = discountCondition ;
    }
    public String getDiscountCondition() {
        return this.discountCondition;
    }

    public void setDiscountValue( Double discountValue ) {
        this.discountValue = discountValue ;
    }
    public Double getDiscountValue() {
        return this.discountValue;
    }

    //--- GETTERS FOR LINKS
    public List<Voucher> getListOfVoucher() {
        return this.listOfVoucher;
    } 

    public List<Promote> getListOfPromote() {
        return this.listOfPromote;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(idSale);
        sb.append("|");
        sb.append(saleCondition);
        sb.append("|");
        sb.append(discountKind);
        sb.append("|");
        sb.append(discountCondition);
        sb.append("|");
        sb.append(discountValue);
        return sb.toString(); 
    } 

}
