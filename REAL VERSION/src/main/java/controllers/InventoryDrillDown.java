package controllers;

import model.Inventory;
import model.InventoryDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "InventoryDrillDown", value = "/InventoryDrillDown")
public class InventoryDrillDown extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String address;
        int InventoryID = 0;
        try {
            InventoryID = Integer.parseInt(request.getParameter("id"));
        } catch (Exception ex) {
            address = "/drilldown.jsp";
        }

        Inventory a = InventoryDB.getInventoryByID(InventoryID);

        if (a == null) {
            address = "/drilldown.jsp";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("inventory", a);
            address = "/drilldown.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }//end doGET

}//end Servlet
