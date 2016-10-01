package service;
import java.util.Map;
import java.util.HashMap;

import model.Customer;
public class CustomerService {
	private Map<String,Customer> customers;
	//싱글턴(공유객체)
	//static으로 공유 final로 변화X
	private static final CustomerService instance =new CustomerService();
	//변수 instance는 회원 가입자 목록을 가리킴
	
	public CustomerService() {
		customers = new HashMap<String, Customer>();
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(),customer); // customer에 추가 ( customer.getId() << key값 , customer << value값 )
	}
	
	public Customer findCustomer(String id){
		if(id != null)
			return (customers.get(id.toLowerCase()));//인자로 받은 id와 동일한 id를 가진 Customer가 있다면 리턴
		else
			return null;
	}

	public Customer login(String id, String password) {
		Customer customera = instance.findCustomer(id);//instance에서 id 가 동일한 Customer을 가져온다.
		
		if(customera!=null){ // id와 동일한 정보를 찾았을때
			if(id.equals(customera.getId()) && password.equals(customera.getPassword())){ //id, password 일치할 경우에 해당 Customer리턴
				return customera;
			}
			else{ // 회원정보와 입력한 값이 일치하지 않는다면 null을 리턴
				return null;
			}	
		}
		return null;//동일한 id로 로그인하지 않는다면 null리턴
	}
	
	
}
