<%@page import="vo.DeptVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<h2>부서정보</h2>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		
		<%
			DeptDAO dao = new DeptDAO();
			List<DeptVO> list = dao.selectAll();
			for(DeptVO vo : list){		
		%>
		
		<tr>
			<td><a href="listGet.jsp?deptno=<%=vo.getDeptno() %>"><%=vo.getDeptno() %></a></td>
			<td><%=vo.getDname() %></td>
			<td><%=vo.getLoc() %></td>
		</tr>
		<%
			}
		
		%>
		
	</table>
	

</body>
</html>











