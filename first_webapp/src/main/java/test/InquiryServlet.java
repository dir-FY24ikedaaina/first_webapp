package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InquiryServlet
 */
@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InquiryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	       
	        var username = request.getParameter("username");
	        var usermail = request.getParameter("usermail");
	        var content = request.getParameter("content");
	        
	       //
	        request.setAttribute("username",username);
	        request.setAttribute("usermail",usermail);
	        request.setAttribute("content",content);
	        
	        //
	        var rd = request.getRequestDispatcher("/WEB-INF/inquiry_result.jsp");
	        rd.forward(request,request);
	    }
	                
	    }
	}

}
