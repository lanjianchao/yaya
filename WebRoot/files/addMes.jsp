<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor"%>
<%@ taglib uri="http://ckfinder.com" prefix="ckfinder"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>项目管理系统</title>
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
      <th class="tablestyle_title" >添加作文页面</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
	

		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>添加作文</legend>
                    <s:form  id="form1" name="form1" action="zuowen.action" method="post" enctype="multipart/form-data">
					   <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					 
					       <tr>
					          <td nowrap align="right" width="13%">作文标题:</td>
					          <td width="41%"><input name="me.mesName"  id="mesName" class="text" style="width:250px" type="text" size="40" />

					       </tr>
					        <tr>
					          <td nowrap align="right" width="13%">作者:</td>
					          <td width="41%"><input name="me.mesWriter"  id="mesWriter" class="text" style="width:250px" type="text" size="40" />

					       </tr>
					        <tr>
					          <td nowrap align="right" width="13%">年级:</td>
					          <td width="41%">
                                   <select id="mesGrade" name="me.mesGrade">
                                   <option value="二年级">二年级</option>
                                   <option value="三年级">三年级</option>
                                   <option value="四年级">四年级</option>
                                   <option value="五年级">五年级</option>
                                   <option value="六年级">六年级</option>
                                   <option value="初一">初一</option>
                                   <option value="初二">初二</option>
                                   <option value="初三">初三</option>
                                   </select>  
                                     </td>
					       </tr>
					       <tr>
					          <td nowrap align="right" width="13%">类别:</td>
					          <td width="41%">
                                   <select id="mesIsPass" name="me.mesIsPass">
                                   <option value="普通">普通</option>
                                   <option value="优秀">优秀</option>
                                   <option value="获奖">获奖</option>
                                   <option value="已发表">已发表</option>
                                  
                                   </select>  
                                     </td>
					       </tr>
					        
					        <tr>
					         <td nowrap align="right" height="120px">作文内容：</td>
					          <td >
				<textarea cols="80"  id="editor1" name="me.mesContent" rows="20"></textarea>
			<ckfinder:setupCKEditor basePath="../ckfinder/" editor="editor1" />
			<ckeditor:replace replace="editor1" basePath="../ckeditor/" /></td>
					       </tr>
					    
                         
					  </table>
                     
                        
		
				</fieldset>			</TD>
		</TR>
		
		</TABLE>
	
	
	 </td>
  </tr>
  

		
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="submit" name="Submit" value="发布" class="button" "/>　
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/></TD>
			   </s:form>
		</TR>
		
 
  </table>

</div>



</body>
</html>
