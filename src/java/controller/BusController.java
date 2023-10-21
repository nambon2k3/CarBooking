package controller;

import dao.BusDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "BusController", urlPatterns = {"/BusController", "/AdminBus"})
public class BusController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action == null) {
            // Default action if 'action' parameter is not provided
            action = "list";
        }

        switch (action) {
            case "list":
                listBuses(request, response);
                break;
            case "add":
                showAddBusForm(request, response);
                break;
            case "detail":
                showBusDetail(request, response);
                break;
            case "update":
                showUpdateBusForm(request, response);
                break;
            case "delete":
                deleteBus(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action parameter");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        switch (action) {
            case "add":
                addBus(request, response);
                break;
            case "update":
                updateBus(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action parameter");
        }
    }

    // List buses (Empty method, provide the actual code here)
    private void listBuses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setAttribute("busList", new BusDAO().getAllBuses());
        
        request.getRequestDispatcher("/admin/AdminBus.jsp").forward(request, response);
        
    }

    // Show add bus form (Empty method, provide the actual code here)
    private void showAddBusForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to display the add bus form here
    }

    // Show bus detail (Empty method, provide the actual code here)
    private void showBusDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to show bus detail here
    }

    // Show update bus form (Empty method, provide the actual code here)
    private void showUpdateBusForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to display the update bus form here
    }

    // Add a bus (Empty method, provide the actual code here)
    private void addBus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to add a bus here
    }

    // Update a bus (Empty method, provide the actual code here)
    private void updateBus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to update a bus here
    }

    // Delete a bus (Empty method, provide the actual code here)
    private void deleteBus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to delete a bus here
    }
}

