<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>丫雅后台管理系统</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.tabfont01 {	
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}
.font051 {font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}
.font201 {font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}
.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}
html { overflow-x: auto; overflow-y: auto; border:0;} 
-->
</style>

<link href="../css/css.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript">

</script>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
</head>
<SCRIPT language=JavaScript>

function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

function unselectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}



</SCRIPT>

<body>
<s:form name="fom" id="fom" method="post" action="book.action">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  
 
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
          	
              <tr>
                <td height="40" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    	<td height="22" colspan="7" align="center" style="font-size:16px">图书列表</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
				     
                    <th >年级</th>
					<th >图书</th>
					<th >作者</th>
						<th >操作</th>
					</tr>
					<tr bgcolor="#FFFFFF">
					
					<td>一、二年级</td>
					<td><s:property value="#session.beList.get(0).bookName" />
					</td>
					<td><s:property value="#session.beList.get(0).bookWriter" /></td>
                    <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(0).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(0).bookId" />">查看|</a>
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>一、二年级</td>
					<td><s:property value="#session.beList.get(1).bookName" /></td>
					<td><s:property value="#session.beList.get(1).bookWriter" /></td>
                     <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(1).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(1).bookId" />">查看|</a>
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>三年级</td>
					<td><s:property value="#session.beList.get(2).bookName" /></td>
					<td><s:property value="#session.beList.get(2).bookWriter" /></td>
                       <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(2).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(2).bookId" />">查看|</a>
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>三年级</td>
					<td><s:property value="#session.beList.get(3).bookName" /></td>
					<td><s:property value="#session.beList.get(3).bookWriter" /></td>
                      <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(3).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(3).bookId" />">查看|</a>
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>四年级</td>
					<td><s:property value="#session.beList.get(4).bookName" /></td>
					<td><s:property value="#session.beList.get(4).bookWriter" /></td>
                      <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(4).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(4).bookId" />">查看|</a>
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>四年级</td>
					<td><s:property value="#session.beList.get(5).bookName" /></td>
					<td><s:property value="#session.beList.get(5).bookWriter" /></td>
                   <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(5).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(5).bookId" />">查看|</a>s
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>五年级</td>
					<td><s:property value="#session.beList.get(6).bookName" /></td>
					<td><s:property value="#session.beList.get(6).bookWriter" /></td>
                     <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(6).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(6).bookId" />">查看|</a>
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>五年级</td>
					<td><s:property value="#session.beList.get(7).bookName" /></td>
					<td><s:property value="#session.beList.get(7).bookWriter" /></td>
                   <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(7).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(7).bookId" />">查看|</a>
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>六年级</td>
				<td><s:property value="#session.beList.get(8).bookName" /></td>
					<td><s:property value="#session.beList.get(8).bookWriter" /></td>
                      <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(8).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(8).bookId" />">查看|</a>
					</td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
					
					<td>六年级</td>
					<td><s:property value="#session.beList.get(9).bookName" /></td>
					<td><s:property value="#session.beList.get(9).bookWriter" /></td>
                    <td><a href="updateBook.action?bookId=<s:property value="#session.beList.get(9).bookId" />">编辑|</a><a href="listBook.action?bookId=<s:property value="#session.beList.get(9).bookId" />">查看|</a>
					</td>
                  </tr>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../images/spacer.gif" width="1" height="1" /></td>
        </tr><Not-Set>
       
      </table></td>
  </tr>
</table>
</s:form>
</body>
</html>
