package com.sda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CarServlet", value = "/car")
public class CarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String country = req.getParameter("country");
        String cars = null;
        if (country == null){
            cars = "No cars";
        }else if (country.equalsIgnoreCase("Niemcy")){
            cars = "Audi, BMW, Volkswagen";
        }else if (country.equalsIgnoreCase("Francja")){
            cars = "Peugeot, Citroen, Toyota, Kia";
        }
        req.setAttribute("cars", cars);

        req.getRequestDispatcher("car.jsp").forward(req, resp);
    }
}
