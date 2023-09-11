package com.spring.lhs0911.exam03;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.ex01.MemberVO;

@WebServlet("/mem3.do")
public class MemberServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		MemberDAO dao = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
		
		String action = request.getParameter("action");
		String nextPage = "";

		if (action== null || action.equals("listMembers")) {
			List<MemberVO> membersList = dao.selectAllMemberList();
			request.setAttribute("membersList", membersList);
			nextPage = "test02_lhs0911/listMembers.jsp";
		} else if (action.equals("selectMemberById")) {
			String id = request.getParameter("value");
			memberVO = dao.selectMemberById(id); //단수형(결과가 하나만 나오는 것)
			request.setAttribute("member", memberVO);
			nextPage = "test02_lhs0911/memberInfo.jsp"; //결과 뷰를 한 개 정보만 가져와서 보이는 것
		} else if (action.equals("selectMemberByPwd")) {
			int pwd = Integer.parseInt(request.getParameter("value"));
			List<MemberVO> membersList = dao.selectMemberByPwd(pwd);
			request.setAttribute("membersList", membersList);
			nextPage = "test02_lhs0911/listMembers.jsp";
		} else if (action.equals("selectMemberByName")) {
			String name = request.getParameter("value");
			List<MemberVO> membersList = dao.selectMemberByName(name); //복수형(결과가 복수로 나오는 것)
			request.setAttribute("membersList", membersList);
			nextPage = "test02_lhs0911/listMembers.jsp"; //결과 뷰를 복수로 정보 가져와서 보이는 것
		} else if (action.equals("selectMemberByEmail")) {
			String email = request.getParameter("value");
			List<MemberVO> membersList = dao.selectMemberByEmail(email); 
			request.setAttribute("membersList", membersList);
			nextPage = "test02_lhs0911/listMembers.jsp"; 
		}
		
		
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);  
		dispatch.forward(request, response);


	}
}
