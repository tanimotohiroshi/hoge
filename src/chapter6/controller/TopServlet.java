package chapter6.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = { "/index.jsp"})
public class TopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws IOException,
ServletException{

		System.out.println("rddry");

////		User user = (User) request.getSession().getAttribute("loginUser");
//		boolean isShowMessageForm;
//		if (user != null){
//			isShowMessageForm = true;
//		}else{
//			isShowMessageForm = false;
//		}
//
//	//	List<UserMessage> messages = new MessageService().getMessage();
//
//		request.setAttribute("messages", messages);
//		request.setAttribute("isShowMessageForm", isShowMessageForm);
//

		request.getRequestDispatcher("/top.jsp").forward(request, response);
	}
}