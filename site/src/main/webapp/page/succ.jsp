<%@page import="com.wg.bean.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>

	<table bordercolor="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>
		</tr>
	<%  List<User> list2 = (List<User>) request.getAttribute("list");
		if(list2!=null && list2.size()>0){
			for(int i = 0;i<list2.size();i++){
				User user = list2.get(i);
				
		%>
		<tr>
			<td><%=user.getUserId()%></td>
			<td><%=user.getUsername()%></td>
			<td><%=user.getPassword()%></td>
		</tr>
		<%	
			}
		}
		
	%>
	</table>		
	
    This is my JSP page. <br>
    <a href="login.do">点击</a>
  </body>
</body>
</html>