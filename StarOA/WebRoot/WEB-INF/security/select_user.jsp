<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%String path = request.getContextPath();
			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<base href="<%=basePath%>">
		<title>系统用户</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="css/vip.css" type="text/css">
				<script type="text/javascript" src="<%=basePath%>js/jquery/jquery.js"></script>
                 <link rel="stylesheet" href="css/box_onfocus.css" type="text/css">
		 <script type="text/javascript" src="<%=basePath%>js/security.js"></script>
		<script type="text/javascript" src="<%=basePath%>js/oddEvenColor.js"></script>
		<SCRIPT type="text/javascript" src="<%=basePath%>js/highLight.js"></SCRIPT>
<script language="javascript" src="js/public.js"></script>
<script type="text/javascript">

	function selectUser(id, name) {
		if (window.opener) {
			window.opener.document.getElementById("userIdId").value = id;
			window.opener.document.getElementById("userNameId").value = name;
			window.close();
		}
	}
</script>

	</head>

	<body >
		<table>
			
				<tr height="15">
					<td background="images/shadow_bg.jpg"></td>
				</tr>
			
		</table>

		<%--查询--%>
		<table >
		<TR>
			<TD height=14 align=right noWrap>
				<!-- 在这里插入查询表单 -->
			</TD>
			<TD height=14 align="left" noWrap>
				
				<form action="security/user/user_selectSearch" method="post">
					
					员工姓名：
					<input type="text" name="user.employee.empName" class="itemname"/>
					&nbsp;&nbsp;
					<input class="frm_btn" type="submit" value="查询" />
					<br />
				</form>

			</TD>
		</TR>
		</table>
		

				<table class="list">
					<tr>
						<td colspan="6" align="right" background="images/title_bg2.jpg"
							>
							<!--------------------------------添加--------------------------------------------- -->

							<div align="right">
							&nbsp;

							</div>
							<!-- ------------------------------------添加------------------------------------ -->



						</td>
					</tr>
					
					
					<tr>
					
					<th>
							<div align="center">
								选择
							</div>
						</th>
						
						<th >
							<div align="center">
								员工姓名
							</div>
						</th>
						
						


					</tr>
					<!---------------------------LOOP START------------------------------>
				<!-- 列表数据栏 -->
				<c:if test="${!empty pm.datas}">
					<c:forEach items="${pm.datas }" var="user">
							<tr>
							
							
							<td >
									<div align="center">
								<input type="radio" 
									onclick="selectUser('${user.id}','${user.employee.empName}')">
									</div>
								</td>
								
								
								
								
								<td>
									<div align="center">
									<c:out value="${user.employee.empName}"></c:out>
									

									</div>
								</td>
								
								

							</tr>
						</c:forEach>
					</c:if>
					<!----------------------LOOP END------------------------------->
					<!-- 在列表数据为空的时候，要显示的提示信息 -->
				<c:if test="${empty pm.datas}">
					<tr>
						<td colspan="5" align="center"
							class="TableBody1" onmouseover="this.bgColor= '#DEE7FF'"
							onmouseout="this.bgColor='#EFF3F7'">
							没有找到相应的记录
						</td>
					</tr>
				</c:if>
					<!-- 在列表数据为空的时候，要显示的提示信息 -->
					
					<tr>
						<td  colspan="6" align="center">
									
									
									
						
						
						
						
						

<table borderColor=#ffffff style="FONT-SIZE: 10pt" class="pager">
			<tr height=28px valign="middle">
				<th align=right noWrap>
					<pg:pager
						url='<%=request.getAttribute("javax.servlet.forward.servlet_path").toString().substring(1) %>'
						items="${pm.total}" maxPageItems="${pagesize}"
						export="currentPageNumber=pageNumber">
						<pg:param name="user.name" />
						<pg:first>
							<a href="${pageUrl}" id="firstpageurl">首页</a>
						</pg:first>
						<pg:prev>
							<a href="${pageUrl }">《</a>
						</pg:prev>
						<pg:pages>
							<c:choose>
								<c:when test="${currentPageNumber eq pageNumber}">
									<font color="red">${pageNumber }</font>
								</c:when>
								<c:otherwise>
									<a href="${pageUrl }">${pageNumber }</a>
								</c:otherwise>
							</c:choose>
						</pg:pages>
						<pg:next>
							<a href="${pageUrl }">》</a>
						</pg:next>
						<pg:last>
							<a href="${pageUrl }">尾页</a>
						</pg:last>
					</pg:pager>
					&nbsp;&nbsp;
				</th>
				<!-- 更改pagesize 开始-->
				<th align=left valign="middle" noWrap width="10%">
					<div style="height: 20px; overflow: hidden; valign: middle">
						<form
							action="<%=request
							.getAttribute("javax.servlet.forward.servlet_path")
							.toString().substring(1)%>">

						<input type="hidden" name="user.name"
												value="${user.name }" />

							<input type="hidden" name="itemtype.description"
								value="${itemtype.description}" />
							<select name="pagesize" onchange="this.form.submit()"
								style="height: 16px; overflow: hidden; valign: middle">
								<c:forEach begin="1" end="50" step="3" var="i">
									<option value="${i}"
										<c:if test="${pagesize eq i }">selected</c:if>>
										${i}
									</option>
								</c:forEach>
							</select>
							行/页

						</form>
					</div>

				</th>
			</tr>
		</table>
		
<SCRIPT type=text/javascript>
            $(document).ready(registerPre);
        </SCRIPT>
	</body>
</html>