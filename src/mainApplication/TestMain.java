package mainApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.print.attribute.standard.PresentationDirection;

public class TestMain {

	public static void main(String[] args) {
		
		Customer c1= new Customer("anil", 3000.05f , "M", "pune");
		Customer c2= new Customer("akash", 4000.05f , "M", "mumbai");
		Customer c3= new Customer("anita", 6000.05f , "F", "pune");
		Customer c4= new Customer("rajiv", 8000.05f , "M", "pune");
		Customer c5= new Customer("kavita", 10000.05f , "F", "banglor");
		 
		List< Customer> customerList= new ArrayList<Customer>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		
		System.out.println("customer List");
		System.out.println(customerList.toString());
		//here we pass customer as argument in lamada expression
		//in body we check the condition and return boolean value 
		//filter all the employee whose salary is grater then 5000
		//we cannot return any other then boolean value  because method
		//of predicate functional interface always return boolean value 
		Predicate<Customer>  filterConditionForSalary=  (Customer c) -> c.getCustSalary().floatValue()>=5000;
		List<Customer> custsalaryGraterThen5000=	customerList.stream().filter(filterConditionForSalary).collect(Collectors.toList());	
		
		
		List<Customer> custsalaryGraterThen50000=	customerList.stream().filter(x -> x.getCustSalary().floatValue()>=5000).collect(Collectors.toList());
		System.out.println("\n customer whose  salary grater then 5000");
		System.out.println(custsalaryGraterThen5000.toString());
		
		//filter those customer living in pune
		Predicate<Customer>  filterConditionForCity=  (Customer c) -> c.getCity().equalsIgnoreCase("PUNE");
		List<Customer> custlivingInPune=	customerList.stream().filter(filterConditionForCity).collect(Collectors.toList());
		System.out.println("\n customer those living in pune");
		System.out.println(custlivingInPune.toString());
		
		//filter those customer who are living in pune and salary grater then 5000
		//here we use AND because both the condition should strictly compulsory satisfied
		// both the condition are true then and then only the AND opreation return true.
		Predicate<Customer> filterConditionForCityAndSalary=filterConditionForSalary.and(filterConditionForCity);
		List<Customer> custlivingInPuneAndsalaryGraterThen5000=	customerList.stream().filter(filterConditionForCityAndSalary).collect(Collectors.toList());
		System.out.println("\n customer those living in pune AND salary grater then 5000");	
		System.out.println(custlivingInPuneAndsalaryGraterThen5000.toString());
		
		//similarly like AND there is OR condition
		//filter those customer who are living in pune or salary grater then 5000
		//here filter those record if either of condition is satisfied 
		
		Predicate<Customer> filterConditionForCityOrSalary=filterConditionForSalary.or(filterConditionForCity);
		List<Customer> custlivingInPuneOrsalaryGraterThen5000=	customerList.stream().filter(filterConditionForCityOrSalary).collect(Collectors.toList());
		System.out.println("\n customer those living in pune or salary grater then 5000");
		System.out.println(custlivingInPuneOrsalaryGraterThen5000.toString());
		
		
		//this also provide NEGATION condition
		
		
		//filter those customer living in pune
		Predicate<Customer>  customerNotLivingInPune=  (Customer c) -> c.getCity().equalsIgnoreCase("PUNE");
		customerNotLivingInPune=customerNotLivingInPune.negate();
		List<Customer> customerNotLivingInPuneList=	customerList.stream().filter(customerNotLivingInPune).collect(Collectors.toList());
		System.out.println("\n customer those not living in pune");
		System.out.println(customerNotLivingInPuneList.toString());
		
	
	//------------------------------------------------------------------------------------
		Predicate<String> string= x -> x.equals("sunil");
		
		System.out.println(string.test("anil"));
		
	
//--------------------------------------------------------------------------------------------
		UserFunctionI username = new UserFunctionI() {

			@Override
			public String extractFirstNmae(String fullName) {
				String[] names = fullName.split("-");
				return names[0];
			}
		};

		String firstnmae = username.extractFirstNmae("anil-kumar");
		System.out.println(firstnmae);
//----------------------------------------------------------------------------------------		

		UserFunctionI usernam = fullName -> {
			String[] names = fullName.split("-");
			return names[0];
		};

		String user = usernam.extractFirstNmae("sunil-kumar");
		System.out.println(user);
		
		//--------------------------------------------------------------

		String[] namesArray = new String[] { "anil-kumar", "sunil/kumar", "anil-singh" };
		List<String> names = Arrays.asList(namesArray);

		List<String> rsult = names.stream().filter(x -> {
			if (x.contains("-")) {
				return true;
			}
			return false;

		}).collect(Collectors.toList());

		System.out.println(rsult);
	}

	String[] namesArray = new String[] { "anil-kumar", "sunil-kumar", "pankaj-singh" };
	ArrayList<String> names = new ArrayList<String>();

	
	public String checkUserName(Predicate<String> name) {
		
		
		return null;
		
	}
	
}
