package controllers;

import model.Inventory;
import model.InventoryDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
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
