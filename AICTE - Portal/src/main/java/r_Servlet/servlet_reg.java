package r_Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBpack.DaoConnect;
import com.Model.AdmissionModel;

/**
 * Servlet implementation class servlet_reg
 */
@WebServlet("/servlet_reg")
public class servlet_reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String Fname=request.getParameter("Fname");
		String Lname=request.getParameter("Lname");
		String username= Fname +" "+ Lname;
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		String degree=request.getParameter("degree");

		AdmissionModel am= new AdmissionModel();
		am.setFname(Fname);
		am.setLname(Lname);	
		am.setUsername(username);
		am.setEmail(email);
		am.setMobile(mobile);
		am.setGender(gender);
		am.setDegree(degree);
	
		try {
			int status=DaoConnect.Rsave(am);
			System.out.println("Status: " + status + " data added successfully.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
