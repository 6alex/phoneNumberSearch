<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
<body>
<table border="1" style="margin:auto;width: 300px;height: 200px">
<form action="query">
	<tr>
	<td>手机号码归属地查询系统:</td>	
	</tr>
	
	<tr>
	<td><input type="text" name="number" placeholder="请输入要查询的手机号码" value="${number }"/></td>	
	<td><input type="submit" value="查询"/></td>
	</tr>
	<tr>
	<td>${mobile }</td>	
	</tr>
</form>
</table>
</body>
</html>
