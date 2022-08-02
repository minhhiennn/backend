/*
 * Created on 2022-04-19 ( 18:58:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package backend.backend.persitence.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "ResetToken"
 *
 * @author Telosys
 */
@Entity
@Table(name = "Reset_Token", schema = "dbo", catalog = "shop")
public class ResetToken implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name = "ID_ACCOUNT", nullable = false)
    private Integer idAccount;

    //--- ENTITY DATA FIELDS 
    @Column(name = "reset_token_content", length = 2147483647)
    private String resetTokenContent;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "reset_token_expires")
    private Date resetTokenExpires;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "password_reset")
    private Date passwordReset;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToOne
    @JoinColumn(name = "ID_ACCOUNT", referencedColumnName = "ID_ACCOUNT", insertable = false, updatable = false)
    @MapsId
    private Account account;


    /**
     * Constructor
     */
    public ResetToken() {
        super();
    }

    public ResetToken(int idAccount, Date passwordReset, String resetTokenContent, Date resetTokenExpires) {
        this.idAccount = idAccount;
        this.passwordReset = passwordReset;
        this.resetTokenContent = resetTokenContent;
        this.resetTokenExpires = resetTokenExpires;
    }

    //--- GETTERS & SETTERS FOR FIELDS
    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public Integer getIdAccount() {
        return this.idAccount;
    }

    public void setResetTokenContent(String resetTokenContent) {
        this.resetTokenContent = resetTokenContent;
    }

    public String getResetTokenContent() {
        return this.resetTokenContent;
    }

    public void setResetTokenExpires(Date resetTokenExpires) {
        this.resetTokenExpires = resetTokenExpires;
    }

    public Date getResetTokenExpires() {
        return this.resetTokenExpires;
    }

    public void setPasswordReset(Date passwordReset) {
        this.passwordReset = passwordReset;
    }

    public Date getPasswordReset() {
        return this.passwordReset;
    }

    //--- GETTERS FOR LINKS
    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //--- toString specific method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(idAccount);
        sb.append("|");
        sb.append(resetTokenContent);
        sb.append("|");
        sb.append(resetTokenExpires);
        sb.append("|");
        sb.append(passwordReset);
        return sb.toString();
    }

}