package me.abdelkarimain.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import me.abdelkarimain.model.Message;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create a message model object
        Message message = new Message("Hello World from Servlet!");

        // Set page title
        request.setAttribute("title", "Hello Page");
        
        // Store the message in the request scope
        request.setAttribute("message", message.getText());

        // Forward the request to the JSP view
        request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
    }
}
