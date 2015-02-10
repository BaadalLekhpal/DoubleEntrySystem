package dao;

import java.sql.ResultSet;

import transferObjects.Company;

public class CompanyDAO {

	public CompanyDAO() {		
	}

	
	public void insertCompany(Company company){
	
		//insert into Company table
		
	}
	
	public Company getCompanyByName(String companyName){
		
		// get result set using company name
		// then call getCompanyObjectFromRS
		

	}
	
	public Company getCompanyById(int companyId){
		

	}

	public Company getCompanyObjectFromRS(ResultSet resultSet){
		
		Company c1 = new Company();
		//fill the attributes using the result set
		return c1;
	}
}
