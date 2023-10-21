package controller;

import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "UserController", urlPatterns = {"/UserController", "/AdminUser"})
public class UserController extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action == null) {
            // Default action if 'action' parameter is not provided
            action = "list";
        }

        switch (action) {
            case "list":
                listUsers(request, response);
                break;
            case "add":
                showAddForm(request, response);
                break;
            case "detail":
                showUserDetail(request, response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
            case "update":
                showUpdateForm(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action parameter");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        switch (action) {
            case "add":
                addUser(request, response);
                break;
            case "update":
                updateUser(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action parameter");
        }
    }

    // List users (Empty method, provide the actual code here)
    private void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setAttribute("userList", new UserDAO().getAllUsers());
        
        request.getRequestDispatcher("/admin/AdminUser.jsp").forward(request, response);
        
    }

    // Show add user form (Empty method, provide the actual code here)
    private void showAddForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to display the add user form here
        // Example: request.getRequestDispatcher("add.jsp").forward(request, response);
    }

    // Show user detail (Empty method, provide the actual code here)
    private void showUserDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to show user detail here
        // Example: request.getRequestDispatcher("detail.jsp").forward(request, response);
    }

    // Add a user (Empty method, provide the actual code here)
    private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to add a user here
        // You should handle the form data and database operations.
        // After adding the user, you may redirect to a success page.
        // Example: response.sendRedirect("success.jsp");
    }

    // Delete a user (Empty method, provide the actual code here)
    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to delete a user here
        // You should handle the user deletion logic, such as database operations.
        // After deleting the user, you may redirect to a success page.
        // Example: response.sendRedirect("success.jsp");
    }

    // Show update user form (Empty method, provide the actual code here)
    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to display the update user form here
        // Example: request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    // Update a user (Empty method, provide the actual code here)
    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement your code to update a user here
        // You should handle the form data and database operations for updating.
        // After updating the user, you may redirect to a success page.
        // Example: response.sendRedirect("success.jsp");
    }
}
