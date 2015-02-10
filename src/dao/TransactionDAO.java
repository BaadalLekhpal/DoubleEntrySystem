package dao;

import java.sql.ResultSet;

import transferObjects.Company;
import transferObjects.Transaction;

public class TransactionDAO {

	private static int transactionId = 1;
	
	public void insertTransaction(Transaction transaction){
		// insert transaction record in Transaction table
	}
	
	public Transaction getTransactionById(int transactionId){
		// get the record from the Transaction table 
		
		
	}
	
	public Transaction getTransactionObjectUsingRS(ResultSet rs){
		//convert the ResultSet got from the table into Transaction object
	}
	
}
