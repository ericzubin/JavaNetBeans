/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.app;

import com.empresa.proyecto.ws.CalculadoraWS_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Eric
 */
@WebServlet(name = "WSCalcular", urlPatterns = {"/WSCalcular"})
public class WSCalcular extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/env-5531558.jl.serv.net.mx_80/CalculadoraWS/CalculadoraWS.wsdl")
    private CalculadoraWS_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            double numero1 = Double.parseDouble(request.getParameter("numero1"));
            double numero2 = Double.parseDouble(request.getParameter("numero2"));
            String EstadoOSu = request.getParameter("Sumar");
            String EstadoORe = request.getParameter("Restar");
            String EstadoOMu = request.getParameter("Multiplicar");
            String EstadoODi = request.getParameter("Dividir");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet WSCalcular</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
            if (EstadoOSu == null) {
            } else {
                            out.println("<h1>Servlet WSCalcular at Sumar " + "</h1>");

                out.print(opSumar(numero1, numero2));

            }
            if (EstadoORe == null) {
            } else {
                            out.println("<h1>Servlet WSCalcular at Restar " + "</h1>");

                out.print(opRestar(numero1, numero2));

            }
            if (EstadoOMu == null) {
            } else {
                            out.println("<h1>Servlet WSCalcular at Multiplicar" + "</h1>");

                out.print(opMultiplicar(numero1, numero2));

            }
            if (EstadoODi == null) {

            } else {
                            out.println("<h1>Servlet WSCalcular at Dividir "+ "</h1>");

                out.print(opDividir(numero1, numero2));

            }

        }

    }

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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private double opDividir(double numero1, double numero2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.empresa.proyecto.ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.opDividir(numero1, numero2);
    }

    private double opMultiplicar(double numero1, double numero2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.empresa.proyecto.ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.opMultiplicar(numero1, numero2);
    }

    private double opRestar(double numero1, double numero2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.empresa.proyecto.ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.opRestar(numero1, numero2);
    }

    private double opSumar(double numero1, double numero2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.empresa.proyecto.ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.opSumar(numero1, numero2);
    }

}
