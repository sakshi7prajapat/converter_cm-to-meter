/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = {"/cmtometer"})
public class cmtometer extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        PrintWriter out = response.getWriter();
        float num =Float.parseFloat(request.getParameter("numD"));
        float result=0;
      // convert into centimeter
        try{
        if(request.getParameter("btnsubmit")!=null)
        {
            result=num*100;
            RequestDispatcher req=request.getRequestDispatcher("cmtometer.jsp?q="+result);
            req.forward(request, response);
        }
        // Convert into meter
        if(request.getParameter("btnsubmit1")!=null)
        {
            result=num/100;
            RequestDispatcher req=request.getRequestDispatcher("cmtometer.jsp?q="+result);
            req.forward(request, response);
        }
        }
        catch(Exception e){
            out.print(e.getMessage().toString());
        }
        
       // out.println(inmeter);
    }
}