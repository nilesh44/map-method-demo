package mainApplication;

public class Customer {
	
	private String custNmae;
	private Float custSalary;
	private String gender;
	private String city;
	
	
	public Customer(String custNmae, Float custSalary, String gender, String city) {
		super();
		this.custNmae = custNmae;
		this.custSalary = custSalary;
		this.gender = gender;
		this.city = city;
	}
	
	
	public String getCustNmae() {
		return custNmae;
	}
	public void setCustNmae(String custNmae) {
		this.custNmae = custNmae;
	}
	public Float getCustSalary() {
		return custSalary;
	}
	public void setCustSalary(Float custSalary) {
		this.custSalary = custSalary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "[custNmae=" + custNmae + ", custSalary=" + custSalary + ", gender=" + gender + ", city=" + city
				+ "]";
	}
	
	
	
	

}
