/*
 * Created on 2022-04-19 ( 18:58:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package backend.backend.persitence.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import backend.backend.persitence.model.enumModel.RoleEnum;

/**
 * JPA entity class for "Role"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Role", schema="dbo", catalog="shop" )
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private Integer    id ;

    //--- ENTITY DATA FIELDS 
    @Column(name="role_name", nullable=false)
    private RoleEnum    roleName ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="role")
    private List<Privilege> listOfPrivilege ; 

    @ManyToMany(mappedBy="listOfRole")
    private List<Account> listOfAccount ; 


    /**
     * Constructor
     */
    public Role() {
		super();
    }
    public Role(RoleEnum roleEnum) {
        this.roleName = roleEnum;
    }
    //--- GETTERS & SETTERS FOR FIELDS
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    public void setRoleName( RoleEnum roleName ) {
        this.roleName = roleName ;
    }
    public RoleEnum getRoleName() {
        return this.roleName;
    }

    //--- GETTERS FOR LINKS
    public List<Privilege> getListOfPrivilege() {
        return this.listOfPrivilege;
    } 

    public List<Account> getListOfAccount() {
        return this.listOfAccount;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(roleName);
        return sb.toString(); 
    } 

}