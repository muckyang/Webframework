package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class Doregister
 */
@WebServlet("/doregister")
public class Doregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Doregister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String id=request.getParameter("customerId");
    	String password=request.getParameter("password");
    	String name=request.getParameter("name");
    	String gender=request.getParameter("gender");
    	String email=request.getParameter("email");
  		
  		String page;
  		Customer customer=new Customer(id,password,name,gender,email);
  		
  		CustomerService service = (CustomerService) CustomerService.getInstance();
  		Customer findcustomer=service.findCustomer(id);//이미 가입한 사람중 아이디가 동일한 사람이 있다면  findcustomer에 저장		
  		
  		
  		if(id==null || password==null || name==null|| gender==null|| email==null ){//회원가입 조건중 하나라도 미입력시
  			page="/view/registererror.jsp";
 		}
  		else if(findcustomer!=null){//이미 동일한 아이디로 가입이되어 있는경우
  					page="/view/sameId.jsp";
  		}
  		else{// 정상적으로 회원가입 
  			service.addCustomer(customer);//회원 추가
  			request.setAttribute("customer", customer);
  			page="/view/registersuccess.jsp";
  		}
  		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
  		dispatcher.forward(request,response);
  	}

}
