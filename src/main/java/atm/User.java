package atm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
private long accountNumber;
private String action;
private double amount;
private double balance;
private String reason;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}

public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}

public void withdraw() {
   
}



}