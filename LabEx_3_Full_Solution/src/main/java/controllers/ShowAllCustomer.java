package controllers;

import model.Customer;
import model.CustomerDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAllCustomer", value = "/ShowAllCustomer")
public class ShowAllCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String address;

        try {
            List<Customer> list = CustomerDB.getAllCustomers();

            if (list == null || list.isEmpty()) {
                address = "/Error.jsp";
            } else {

                address = "/ShowAllCustomer.jsp";
                request.setAttribute("list", list);
            }

        }//end try
        catch (Exception ex) {
            address = "/Error.jsp";
        }//end catch


        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);


    }

}
