package transferObjects;

import java.util.List;

public class Order {

	private int orderNo;
	private List<ItemsOrdered> itemList;
	private int orderAmount;
	
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public List<ItemsOrdered> getItemList() {
		return itemList;
	}
	public void setItemList(List<ItemsOrdered> itemList) {
		this.itemList = itemList;
	}
	
}
