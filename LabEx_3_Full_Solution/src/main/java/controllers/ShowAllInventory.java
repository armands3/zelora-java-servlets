package controllers;

import model.Inventory;
import model.InventoryDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAllInventory", value = "/ShowAllInventory")
public class ShowAllInventory extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String address;

        try {
            List<Inventory> list = InventoryDB.getAllInventory();

            if (list == null || list.isEmpty()) {
                address = "/Error.jsp";
            } else {

                address = "/ShowAllInventory.jsp";
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
