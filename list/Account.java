package list;

public class Account {
	private static long num = 0;
	private long id;
	private double balance;
	private String password;

	public Account(long id, double balance, String password) {
		super();
		this.id = id;
		this.balance = balance;
		this.password = password;
	}

	public Account(double balance, String password) {
		super();
		this.id = num++;
		this.balance = balance;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
