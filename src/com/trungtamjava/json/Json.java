package com.trungtamjava.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(urlPatterns = "/json")

public class Json extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		User user = new User(1, "Luong Van Thong");
		User[] user1=new User[3];
		user1[0]=new User(1, "Luong Van Thong");
		user1[1]=new User(2, "Luong Van Thong");
		user1[2]=new User(3, "Luong Van Thong12");
		Gson gson = new Gson();
		PrintWriter printWriter = resp.getWriter();
		printWriter.println(gson.toJson(user1));
		
		//for(int i=0;i<user1.length;i++) {
	//		printWriter.println(gson.toJson(user1[i]));
		//}
	}
}
