import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		
		
	}

	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public void withdraw(double w) {
		
		balance -= w;
		
	}
	
	public void deposit(double deposit) {
		
		balance += deposit;
		
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		
		return annualInterestRate / 12;
		
	}
	
	

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + "]";
	}
	
	
	
	

}
