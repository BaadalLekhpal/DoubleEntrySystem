package transferObjects;

public class DoubleEntryAccountLogging {

	private int doubleEntryAccountLoggingId;
	private Transaction transaction;
	private String transactionType;
	private Account account;
	private int amount;
	public int getDoubleEntryAccountLoggingId() {
		return doubleEntryAccountLoggingId;
	}
	public void setDoubleEntryAccountLoggingId(int doubleEntryAccountLoggingId) {
		this.doubleEntryAccountLoggingId = doubleEntryAccountLoggingId;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
