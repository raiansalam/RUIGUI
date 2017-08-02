/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author raian
 */
@WebServlet("/widgetServlet")
public class WidgetButton extends HttpServlet{
    ActionListener actionListener;
    
    protected void doPost(HttpServletResponse response, HttpServletRequest request)
            throws ServletException, IOException{
    
    }
    
}
