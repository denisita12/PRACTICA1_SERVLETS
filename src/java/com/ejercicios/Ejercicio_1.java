
package com.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ejercicio_1", urlPatterns = {"/Ejercicio_1"})
public class Ejercicio_1 extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Saludo de Bienvenida</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div align='center'>");
            
             out.println("<h1>Ejercicio #1</h1>");
            out.println("<h2>Calcular Edad</h2>");
            out.println("<form action='Salida_1' method='post'>");
            out.println("<label>Nombre: </label>");
            out.println("<input type='text' name='nombre'>");

            out.println("<br>");
            out.println("<label>Año de Nacimiento: </label>");
            out.println("<input type='number' name='fecha'>");
            out.println("<br>");
            out.println("<input type='submit' name='procesar'>");

            
            
            out.println("<br>");
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }


  
}