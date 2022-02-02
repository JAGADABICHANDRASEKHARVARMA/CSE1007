package com.JAVACSE1007.LABDA4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Insert")
public class Insert extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public Insert() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter out=response.getWriter();
        String Studentid=request.getParameter("Studentid");
        String studentname=request.getParameter("studentname");
        String DOB=request.getParameter("DOB");
        String current_year=request.getParameter("current_year");
        String DOJ=request.getParameter("DOJ");


        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/staff_info","root","kavi1234");
            String qr="insert into staff values(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(qr);
            ps.setString(1,Studentid);
            ps.setString(2,studentname);
            ps.setString(3,DOB);
            ps.setString(4,current_year);
            ps.setString(5,DOJ);
            int i=ps.executeUpdate();
            if(i>0)
            {
                response.sendRedirect("index.html");

            }else
            {
                out.println("record not added");
            }
            con.close();

        }catch(Exception e)
        {
            out.println(e);
        }



    }

}