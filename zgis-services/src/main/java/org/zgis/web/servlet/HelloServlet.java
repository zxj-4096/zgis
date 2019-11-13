package org.zgis.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zgis.web.bean.User;
import org.zgis.web.services.impl.UserServiceImpl;

@WebServlet("/login")
public class HelloServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: test ").append(request.getContextPath());
        UserServiceImpl usi = new UserServiceImpl();
        User user = new User();
        user.setPassword("b");
        user.setUsername("a");
        usi.longin(user);
        System.out.println("hello:::index");
        //request.getRequestDispatcher("/index").forward(request, response);
    }
    /**
     * 
     */
public static void main(String[] args) {
    
}
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
