package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author anhdu
 */
@WebServlet(name = "TicketController", urlPatterns = {"/TicketController"})
public class TicketController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action == null) {
            // Default action if 'action' parameter is not provided
            action = "list";
        }

        switch (action) {
            case "list":
                listTickets(request, response);
                break;
            case "add":
                showAddTicketForm(request, response);
                break;
            case "detail":
                showTicketDetail(request, response);
                break;
            case "update":
                showUpdateTicketForm(request, response);
                break;
            case "delete":
                deleteTicket(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action parameter");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        switch (action) {
            case "add":
                addTicket(request, response);
                break;
            case "update":
                updateTicket(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action parameter");
        }
    }

    // List tickets (Empty method, provide the actual code here)
    private void listTickets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to list tickets here
    }

    // Show add ticket form (Empty method, provide the actual code here)
    private void showAddTicketForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to display the add ticket form here
    }

    // Show ticket detail (Empty method, provide the actual code here)
    private void showTicketDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to show ticket detail here
    }

    // Show update ticket form (Empty method, provide the actual code here)
    private void showUpdateTicketForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to display the update ticket form here
    }

    // Add a ticket (Empty method, provide the actual code here)
    private void addTicket(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to add a ticket here
    }

    // Update a ticket (Empty method, provide the actual code here)
    private void updateTicket(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to update a ticket here
    }

    // Delete a ticket (Empty method, provide the actual code here)
    private void deleteTicket(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to delete a ticket here
    }
}

