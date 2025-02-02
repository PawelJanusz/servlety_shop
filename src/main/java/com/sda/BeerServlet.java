package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BeerServlet", value = "/beer")
public class BeerServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("beerAdvice.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String beertype = req.getParameter("beertype");
        Person person = null;

        if (beertype.equalsIgnoreCase("strong")){
            person = new Person(username, beertype, "Warka Strong");
        }else if (beertype.equalsIgnoreCase("dark")){
            person = new Person(username, beertype, "Lech");
        }else {
            person = new Person(username, beertype, "Desperados");
        }
        req.setAttribute("person", person);

        //req.setAttribute("username", username);
        //req.setAttribute("beertype", beertype);

        req.getRequestDispatcher("beerAnswer.jsp").forward(req, resp);
    }
}
