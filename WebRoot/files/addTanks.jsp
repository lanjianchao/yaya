<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>丫雅后台管理系统_添加家长感言</title>
<link rel="stylesheet" rev="stylesheet" href="../css/style.css" type="text/css" media="all" />


<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
		<script type="text/javascript" src="../ckfinder/ckfinder.js"></script>
</head>

<body class="ContentBody">
 
<div class="MainDiv">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >添加家长感言页面</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
	

		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>添加感言</legend>
                    <form  id="form1" name="form1" action="#" method="post" enctype="multipart/form-data">
					   <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					 
					       <tr>
					          <td nowrap align="right" width="13%">感谢人:</td>
					          <td width="41%"><input name="text" class="text" style="width:250px" type="text" size="40" />

					       </tr>
					       <tr>
					          <td nowrap align="right" width="13%">内容标题:</td>
					          <td width="41%"><input name="text" class="text" style="width:250px" type="text" size="40" />

					       </tr>


					        <tr>
					         <td nowrap align="right" height="120px">内容：</td>
					          <td >
				<textarea cols="80" id="editor1" name="detail" rows="20"></textarea>
				
			                       
			</td>
					       </tr>
					      
					       
					    
                         
					  </table>
                        </form>
                        
		
				</fieldset>			</TD>
		</TR>
		
		</TABLE>
	
	
	 </td>
  </tr>
  

		
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="button" name="Submit" value="发布" class="button" onclick="link();"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/></TD>
		</TR>
		
 
  </table>

</div>



</body>
</html>
