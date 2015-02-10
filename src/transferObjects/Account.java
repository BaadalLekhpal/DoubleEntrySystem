package transferObjects;

public class Account {

	private String accountName;
	private int accountNo;
	private int accountNetBalance;
	private Company accountAssociatedCompany;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getAccountNetBalance() {
		return accountNetBalance;
	}
	public void setAccountNetBalance(int accountNetBalance) {
		this.accountNetBalance = accountNetBalance;
	}
	public Company getAccountAssociatedCompany() {
		return accountAssociatedCompany;
	}
	public void setAccountAssociatedCompany(Company accountAssociatedCompany) {
		this.accountAssociatedCompany = accountAssociatedCompany;
	}
	
}
