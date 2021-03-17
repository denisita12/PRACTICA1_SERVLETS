
package com.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Principal", urlPatterns = {"/Principal"})
public class Principal extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Main</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div align='center'>");
            out.println("<h1>PRACTICA 1 SERVLETS</h1>");
            out.println("<h3>UNIV.DENNIS GENOVA VILLASANTI YANARICO</h3>");
            out.println("<h3>C.I.:9886618    R.U.:200020022</h3>");
            out.println("<a href='Ejercicio_1'>Ejercicio #1");
            out.println("<br>");
           out.println("<a href='Ejercicio_2'>Ejercicio #2");
            out.println("<br>");
            out.println("<a href='Ejercicio_3'>Ejercicio #3");
            out.println("<br>");
            out.println("<a href='Ejercicio_4'>Ejercicio #4");
            out.println("<br>");
            out.println("<a href='Ejercicio_5'>Ejercicio #5");
            out.println("<br>");
            out.println("<a href='Ejercicio_6'>Ejercicio #6");
            out.println("<br>");
            out.println("<a href='Ejercicio_7'>Ejercicio #7");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
