package com.sda;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebInitParam(name = "ParamsContextServlet", value = "/context-params")
public class ParamsContextServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

        String eMail = servletContext.getInitParameter("email");
        resp.getWriter().println("Please contact me: " + eMail);
    }
}
