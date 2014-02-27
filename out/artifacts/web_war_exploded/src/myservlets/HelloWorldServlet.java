package myservlets;

import mybeans.HelloWorldBean;

import javax.ejb.EJB;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: guilherme
 * Date: 2/27/14
 * Time: 2:23 AM
 * To change this template use File | Settings | File Templates.
 */

@javax.servlet.annotation.WebServlet(name = "HelloWorldServlet", urlPatterns = "/helloworld")
public class HelloWorldServlet extends javax.servlet.http.HttpServlet {
    @EJB
    private HelloWorldBean helloWorldBean;
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        String hello=helloWorldBean.sayHello();
        request.setAttribute("hello",hello);
        request.getRequestDispatcher("hello.jsp").forward(request,response);
    }
}
