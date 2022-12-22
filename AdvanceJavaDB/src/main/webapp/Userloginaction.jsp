<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String u1=request.getParameter("uname");
String p1=request.getParameter("pass");

String str1="select * from adduserreg";

Class.forName("org.h2.Driver");
Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/advancejava16","sa","");
Statement stmt=conn.createStatement();

ResultSet rs=stmt.executeQuery(str1);

rs.next();

String u=rs.getString(1);

String p=rs.getString(2);

if(u1.equals(u)&&p1.equals(p))
{
	HttpSession sess=request.getSession();
	sess.setAttribute("k1",u1);
	RequestDispatcher rd=request.getRequestDispatcher("UserHomePage.jsp");
	rd.forward(request, response);
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("UserLogin.jsp");
	rd.include(request, response);
	out.println("LoginFail!!!");
}



%>
</body>
</html>