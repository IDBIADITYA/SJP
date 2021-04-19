package com.sjp.Model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Author")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="Auth_First_Name")
	private String auth_first_Name;
	
	@Column(name="Auth_Last_Name")
	private String auth_last_Name;
	
	@Column(name="Auth_email_Id")
	private String auth_email_Id;
	
	
	public Author() {
		
	}
	public Author(long id, String auth_first_Name, String auth_last_Name, String auth_email_Id) {
		super();
		Id = id;
		this.auth_first_Name = auth_first_Name;
		this.auth_last_Name = auth_last_Name;
		this.auth_email_Id = auth_email_Id;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getAuth_first_Name() {
		return auth_first_Name;
	}
	public void setAuth_first_Name(String auth_first_Name) {
		this.auth_first_Name = auth_first_Name;
	}
	public String getAuth_last_Name() {
		return auth_last_Name;
	}
	public void setAuth_last_Name(String auth_last_Name) {
		this.auth_last_Name = auth_last_Name;
	}
	public String getAuth_email_Id() {
		return auth_email_Id;
	}
	public void setAuth_email_Id(String auth_email_Id) {
		this.auth_email_Id = auth_email_Id;
	}
	
	

}
