package dao;

import java.util.List;
import java.util.Map;

import transferObjects.Item;
import transferObjects.ItemsOrdered;
import transferObjects.Order;

public class OrderDAO {

	public OrderDAO() {

		
	}
		
	public void insertOrder(Order order){

		List<ItemsOrdered> itemList = order.getItemList();
		
		for(int i = 0; i< itemList.size(); i++){
			ItemsOrdered itemOrdered = itemList.get(i);
			insertItemOrdered(itemOrdered, order.getOrderNo());
		}
		
		//insert into order table
	}
	
	public void insertItemOrdered(ItemsOrdered itemOrdered, int orderNo){
		//insert into itemsOrdered table
	}
	
}
