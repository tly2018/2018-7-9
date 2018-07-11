<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	*{
		padding:0;
		margin:0;
	}
	table{
		border-collapse:collapse;
	}
	table,thead th,tbody td{
		border:solid 1px #000;
		padding-left:5px;
	}
	ul{
		margin-top:40px;
	}
	ul li{
		list-style:none;
		float:left;
		width:50px;
		height:20px;
		border:solid 1px #000;
		padding:10px;
		text-align:center;
	}
	ul li a{
		display:block;
	}
	ul li:hover{
		background-color:#000;
		color:#fff;
	}
</style>
<body>
	<form method="post">
	<input name="pname" value="${two.pname }" /> <input type="submit" value="查询" />
	</form>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>pid</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${all }" var="two">
			<tr>
				<td>${two.no}</td>
				<td>${two.pname }</td>
				<td>${two.p }</td>
			</tr>
		</c:forEach>
		
		</tbody>
	</table>
	<ul>
		<li><a href="list.do?pageNum=1">首页</a></li>
		<li><a href="">上一页</a></li>
		<li><a href="list.do?pageNum=1">1</a></li>
		<li><a href="list.do?pageNum=2">2</a></li>
		<li><a href="list.do?pageNum=3">3</a></li>
		<li><a href="list.do?pageNum=4">4</a></li>
		<li><a href="list.do?pageNum=5">5</a></li>
		<li><a href="list.do?pageNum=6">6</a></li>
		<li><a href="">下一页</a></li>
		<li><a href="list.do?pageNum=6">尾页</a></li>
	</ul>
</body>
</html>