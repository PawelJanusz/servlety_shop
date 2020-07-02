package com.sda.shop.controller;

import com.sda.shop.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteProductController", value = "/delete-product")
public class DeleteProductController extends HttpServlet {

    private ProductService productService = ProductService.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Integer productId = 0;

        try{
            productId = Integer.valueOf(id);
        }catch (NumberFormatException e){
            //zalogować błąd  log.error(....)
            System.out.println("Invalid productId: "+ productId );
        }
        productService.deleteProduct(productId);
        resp.sendRedirect("/all-products");
    }
}
