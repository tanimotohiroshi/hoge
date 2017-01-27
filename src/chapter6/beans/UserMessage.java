package chapter6.beans;

import java.io.Serializable;
import java.util.Date;

public class UserMessage implements Serializable{
	private static final long serialVersionUID = 1L;

	private String account;
	private String name;
	private int id;
	private int userId;
	private String text;
	private Date insertDate;

	public String getAccount(){
		return account;
	}
	public void setAccount(String account){
		this.account = account;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

}
