package transferObjects;

public class ItemsOrdered {

	private int itemOrderedId;
	private Order order;
	private Item itemOrdered;
	private int itemQuantity;
	public int getItemOrderedId() {
		return itemOrderedId;
	}
	public void setItemOrderedId(int itemOrderedId) {
		this.itemOrderedId = itemOrderedId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Item getItemOrdered() {
		return itemOrdered;
	}
	public void setItemOrdered(Item itemOrdered) {
		this.itemOrdered = itemOrdered;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
}
