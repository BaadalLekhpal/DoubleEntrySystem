package transferObjects;

public class Voucher {

	private int voucherId;
	private Company voucherSourceCompany; // source company is the company who is making this voucher(logged in)
	private Company voucherTargetCompany;
	private Order voucherOrder;
	private String voucherType;
	
	public Voucher() {
	
	}
	
	public Voucher(String voucherType) {
		this.voucherType = voucherType;
	}
	
	public int getVoucherId() {
		return voucherId;
	}
	public void setVoucherId(int voucherId) {
		this.voucherId = voucherId;
	}
	public Company getVoucherSourceCompany() {
		return voucherSourceCompany;
	}
	public void setVoucherSourceCompany(Company voucherSourceCompany) {
		this.voucherSourceCompany = voucherSourceCompany;
	}
	public Company getVoucherTargetCompany() {
		return voucherTargetCompany;
	}
	public void setVoucherTargetCompany(Company voucherTargetCompany) {
		this.voucherTargetCompany = voucherTargetCompany;
	}
	public Order getVoucherOrder() {
		return voucherOrder;
	}
	public void setVoucherOrder(Order voucherOrder) {
		this.voucherOrder = voucherOrder;
	}

	public String getVoucherType() {
		return voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
