package transferObjects;

public class Company {

	private String companyName;
	private int companyId;
	private String companyAddress;
	
	public String getCompanyName(){
		return this.companyName;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
}
