/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author raian
 */
@WebServlet("/nameServlet")
public class NameServlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException{
        String nem = request.getParameter("name");
        
        System.out.println("Name:" + nem);
        
        PrintWriter writer = response.getWriter();
        
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Your username is:" + nem + "</h2><br/>";
        htmlResponse += "</html>";
        
        writer.println(htmlResponse);
    }
}
