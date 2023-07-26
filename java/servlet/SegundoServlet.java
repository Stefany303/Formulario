package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/segundo-servlet")
public class SegundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //out es una respuesta que se envía de manera directa al servidor
        PrintWriter out = resp.getWriter();
        String email=req.getParameter("email");
        String pwd=req.getParameter("password");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Segundo Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Datos del Formulario</h3>");
        out.println("<h4>Correo Electronico"+ email +"</h4>");
        out.println("<h4>Password"+ pwd +"</h4>");
        out.println("</body>");
        out.println("</html>");

    }
}
