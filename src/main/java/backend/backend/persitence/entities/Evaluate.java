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
 * JPA entity class for "Evaluate"
 *
 * @author Telosys
 */
@Entity
@Table(name = "Evaluate", schema = "dbo", catalog = "shegga_shopvip132")
public class Evaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evaluate", nullable = false)
    private Integer idEvaluate;

    // --- ENTITY DATA FIELDS
    @Column(name = "id_single_product_page")
    private Integer idSingleProductPage;

    @Column(name = "id_customer")
    private Integer idCustomer;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_create")
    private Date dateCreate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_update")
    private Date dateUpdate;

    @Column(name = "like_count")
    private Integer likeCount;

    @Column(name = "rate_star")
    private Byte rateStar;

    @Column(name = "content", length = 2147483647)
    private String content;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy = "evaluate")
    private List<EvaluateReply> listOfEvaluateReply;

    @ManyToOne
    @JoinColumn(name = "id_single_product_page", referencedColumnName = "id_single_product_page", insertable = false, updatable = false)
    private SingleProductPage singleProductPage;

    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer", insertable = false, updatable = false)
    private Customer customer;


    /**
     * Constructor
     */
    public Evaluate() {
        super();
    }

    //--- GETTERS & SETTERS FOR FIELDS
    public void setIdEvaluate(Integer idEvaluate) {
        this.idEvaluate = idEvaluate;
    }

    public Integer getIdEvaluate() {
        return this.idEvaluate;
    }

    public void setIdSingleProductPage(Integer idSingleProductPage) {
        this.idSingleProductPage = idSingleProductPage;
    }

    public Integer getIdSingleProductPage() {
        return this.idSingleProductPage;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdCustomer() {
        return this.idCustomer;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateCreate() {
        return this.dateCreate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Date getDateUpdate() {
        return this.dateUpdate;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public void setRateStar(Byte rateStar) {
        this.rateStar = rateStar;
    }

    public Byte getRateStar() {
        return this.rateStar;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    //--- GETTERS FOR LINKS
    public List<EvaluateReply> getListOfEvaluateReply() {
        return this.listOfEvaluateReply;
    }

    public SingleProductPage getSingleProductPage() {
        return this.singleProductPage;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    //--- toString specific method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(idEvaluate);
        sb.append("|");
        sb.append(idSingleProductPage);
        sb.append("|");
        sb.append(idCustomer);
        sb.append("|");
        sb.append(dateCreate);
        sb.append("|");
        sb.append(dateUpdate);
        sb.append("|");
        sb.append(likeCount);
        sb.append("|");
        sb.append(rateStar);
        sb.append("|");
        sb.append(content);
        return sb.toString();
    }

}
