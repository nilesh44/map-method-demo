package mainApplication;

public class Employee {

	private Integer empId;
	private String  empNmae;
	private Float   empSalary;
	private String  empgender;
	private String  empcity;
	
	
	public Employee(Integer empId, String empNmae, Float empSalary, String empgender, String empcity) {
		super();
		this.empId = empId;
		this.empNmae = empNmae;
		this.empSalary = empSalary;
		this.empgender = empgender;
		this.empcity = empcity;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpNmae() {
		return empNmae;
	}


	public void setEmpNmae(String empNmae) {
		this.empNmae = empNmae;
	}


	public Float getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}


	public String getEmpgender() {
		return empgender;
	}


	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}


	public String getEmpcity() {
		return empcity;
	}


	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}


	@Override
	public String toString() {
		return "[empId=" + empId + ", empNmae=" + empNmae + ", empSalary=" + empSalary + ", empgender="
				+ empgender + ", empcity=" + empcity + "]";
	}
	
	
	
}
