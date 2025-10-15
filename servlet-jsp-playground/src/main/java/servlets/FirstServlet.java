package servlets;

import jakarta.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet {
    private ServletConfig servletConfig;

    //life Cycle methods
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
        System.out.println("Initializing Servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        servletResponse.getWriter().println("<h1>FirstServlet is working!</h1>");
        System.out.println("Service Request");
    }

    @Override
    public void destroy() {
        System.out.println("Destroying servlet");
    }

    //Non-life Cycle methods

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }



    @Override
    public String getServletInfo() {
        return "this servlet is created by author teja";
    }


}
