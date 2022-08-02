/*
 * Created on 2022-05-06 ( 17:51:47 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package backend.backend.persitence.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Promote"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Promote", schema="dbo", catalog="shop" )
public class Promote implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_promote", nullable=false)
    private Integer    idPromote ;

    //--- ENTITY DATA FIELDS 
    @Column(name="id_sale")
    private Integer    idSale ;

    @Column(name="name", length=2147483647)
    private String     name ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_start")
    private Date       dateStart ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_end")
    private Date       dateEnd ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="id_sale", referencedColumnName="id_sale", insertable=false, updatable=false)
    private Sale       sale ; 

    @ManyToMany
    @JoinTable(name="Promote_Product_List", 
      joinColumns=@JoinColumn(name="id_promote", referencedColumnName="id_promote"),
      inverseJoinColumns=@JoinColumn(name="id_product", referencedColumnName="id_product")
     )
    private List<Product> listOfProduct ; 


    /**
     * Constructor
     */
    public Promote() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setIdPromote( Integer idPromote ) {
        this.idPromote = idPromote ;
    }
    public Integer getIdPromote() {
        return this.idPromote;
    }

    public void setIdSale( Integer idSale ) {
        this.idSale = idSale ;
    }
    public Integer getIdSale() {
        return this.idSale;
    }

    public void setName( String name ) {
        this.name = name ;
    }
    public String getName() {
        return this.name;
    }

    public void setDateStart( Date dateStart ) {
        this.dateStart = dateStart ;
    }
    public Date getDateStart() {
        return this.dateStart;
    }

    public void setDateEnd( Date dateEnd ) {
        this.dateEnd = dateEnd ;
    }
    public Date getDateEnd() {
        return this.dateEnd;
    }

    //--- GETTERS FOR LINKS
    public Sale getSale() {
        return this.sale;
    } 

    public List<Product> getListOfProduct() {
        return this.listOfProduct;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(idPromote);
        sb.append("|");
        sb.append(idSale);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(dateStart);
        sb.append("|");
        sb.append(dateEnd);
        return sb.toString(); 
    } 

}
