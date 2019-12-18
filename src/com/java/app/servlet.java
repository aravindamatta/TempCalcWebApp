package com.java.app;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


import org.apache.jasper.tagplugins.jstl.core.Out;
import javax.servlet.http.*;

//@WebServlet("/call")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");      
	       	
		 	double v1=0,v4=0 ;
		 	if(!request.getParameter("ip").matches("[A-Za-z_]+") && !request.getParameter("ip").equals(null)&& !request.getParameter("ip").matches("^\\s*$")){
		 		v1=Double.parseDouble(request.getParameter("ip"));}
	        String v2 = request.getParameter("InputUM");
	        String v3 = request.getParameter("TargetUM");
	        if(!request.getParameter("sres").matches("[A-Za-z_]+") && !request.getParameter("sres").equals(null) && !request.getParameter("sres").matches("^\\s*$")){
	         v4 = Double.parseDouble(request.getParameter("sres")); }
	        String message = null;	


	        double c2f = ((v1)* 9 / 5) + 32; 
	        double c2k = v1 + 273.15 ;
	        double f2c = (v1 - 32) *5/9; 
	        double f2k = (v1 - 32) * 5/9 + 273.15 ;
	        double k2c = v1 - 273.15;
	        double k2f = (v1 - 273.15) * 9/5 + 32 ; 

	        
	 if (!request.getParameter("ip").matches("[A-Za-z_]+") ){

		if (v2.equals("Fahrenheit")&& v3.equals("Celsius")){
			if(f2c==v4){
				  message = " Correct...";
			   }else{
				  message = "Incorrect .. Correct value is ."+f2c;
			   }
		}else if (v2.equals("Celsius") && v3.equals("Fahrenheit")){
			if(c2f==v4){
				message = " Correct...";
			   }else{
				  message = " Answere "+v4+" is incorrect and correct value is ."+c2f;
			   }
		}else if (v2.equals("Fahrenheit")&& v3.equals("Kelvin")){
			if(f2k==v4){
				message = " Correct...";
			   }else{
				  message = " Incorrect and correct value is ."+f2k;
			   }
		}else if (v2.equals("Celsius")&& v3.equals("Kelvin")){
			if(c2k==v4){
				message = " Correct...";
			   }else{
				  message = " incorrect and correct value is ."+c2k;
			   }
		}else if (v2.equals("Kelvin")&& v3.equals("Celsius")){
			if(k2c==v4){
				message = " Correct...";
			   }else{
				  message = "Incorrect and correct value is ."+k2c;
			   }
		}else if (v2.equals("Kelvin")&& v3.equals("Fahrenheit")){
			if(k2f==v4){
				message = " Correct...";
			   }else{
				  message = "Incorrect and correct value is ."+k2f;
			   }
		}else if (v2.equals(v3)){
			if(v1==v4){
			message = "correct! ..Answere is "+v1;
			}else{message = "Incorrect! ..Answere is "+v1;}
		}
	 }else{
	       message =" Invalid input!.";
	  }
		request.setAttribute("message", message);
        request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}






