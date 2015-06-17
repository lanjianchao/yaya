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


<script type="text/javascript">
function BrowseServer(inputId)
{
var finder = new CKFinder() ;
finder.basePath = '../ckfinder/'; //导入CKFinder的路径
finder.selectActionFunction = SetFileField; //设置文件被选中时的函数
finder.selectActionData = inputId; //接收地址的input ID
finder.popup() ; 
}
//文件选中时执行
function SetFileField(fileUrl,data)
{
document.getElementById(data["selectActionData"]).value = fileUrl ;
}
</script>
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
      <th class="tablestyle_title" >编辑丫雅之星页面</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
	

		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>编辑丫雅之星</legend>
                    <s:form  id="form1" name="form1" action="updateYyStar.action" method="post" enctype="multipart/form-data">
                    <input type="text"  name="ye.yyId" value="<s:property value="#session.ye.yyId"/>" hidden></input>
					   <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					 
					       <tr>
					          <td nowrap align="right" width="13%">人名:</td>
					          <td width="41%"><input name="ye.yyName" value="<s:property value="#session.ye.yyName"/>"  class="text" style="width:250px" type="text" size="40" />

					       </tr>
					        <tr>
					          <td nowrap align="right" width="13%">类别:</td>
					          <td width="41%"><select id="start" name="ye.yyType"  value="<s:property value="#session.ye.yyType"/>">
					          <option  value="作文">作文之星</option>
					          <option value="数学">数学之星</option>
					          </select>

					       </tr>
					
					        <tr>
					         <td nowrap align="right" height="120px">个人简介：</td>
					          <td >
				<textarea cols="80" id="editor1" name="ye.yyContent" rows="20"><s:property value="#session.ye.yyContent"/></textarea>
				
			          
			<ckfinder:setupCKEditor basePath="../ckfinder/" editor="editor1" />
			<ckeditor:replace replace="editor1" basePath="../ckeditor/" /></td>
					       </tr>
					       
					       <tr>
					       <td>上传一张照片：</td>
					       <td><input type="text" name="ye.yyPic"  value="<s:property value="#session.ye.yyPic"/>" id="file" onclick="BrowseServer('file');" ></input></td>
					       </tr>
					    
                         
					  </table>
                       
                        
		
				</fieldset>			</TD>
		</TR>
		
		</TABLE>
	
	
	 </td>
  </tr>
  

		
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="submit" name="Submit" value="保存" class="button" onclick="link();"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/></TD>
			 </s:form>
		</TR>
		
 
  </table>

</div>



</body>
</html>
