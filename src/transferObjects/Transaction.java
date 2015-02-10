package transferObjects;

public class Transaction {

	private int transactionId;
	private Company transactionMerchant;
	private Voucher transactionVoucher;
	private String transactionType;
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	private int transactionAmount;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Company getTransactionMerchant() {
		return transactionMerchant;
	}
	public void setTransactionMerchant(Company transactionMerchant) {
		this.transactionMerchant = transactionMerchant;
	}
	public Voucher getTransactionVoucher() {
		return transactionVoucher;
	}
	public void setTransactionVoucher(Voucher transactionVoucher) {
		this.transactionVoucher = transactionVoucher;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	

}
