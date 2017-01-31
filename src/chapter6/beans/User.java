package chapter6.beans;

import java.io.Serializable;
import java.sql.Timestamp;


public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String accountOrEmail;
	private String account;
	private String name;
	private String email;
	private String password;
	private String description;
	private Timestamp insertDate;
	private Timestamp updateDate;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountOrEmail() {
		return accountOrEmail;
	}

	public void setAccountOrEmail(String AccountOrEmail){
		this.accountOrEmail = AccountOrEmail;
	}


	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public Timestamp getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Timestamp insertDate2) {
		this.insertDate = insertDate2;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}
