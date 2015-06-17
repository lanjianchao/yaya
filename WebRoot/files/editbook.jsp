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
      <th class="tablestyle_title" >编辑书籍页面</th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" style="width:100%">
	

		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>编辑书籍</legend>
                    <s:form  id="form1" name="form1" action="saveBook.action" method="post" enctype="multipart/form-data">
					   <input type="text"  name="be.bookId" value="<s:property value="#session.be.bookId"/>" hidden></input>
					   <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					    
					       <tr>
					          <td nowrap align="right" width="13%">书名:</td>
					          <td width="41%"><input name="be.bookName" value="<s:property value="#session.be.bookName"/>" class="text" style="width:250px" type="text" size="40" />

					       </tr>
					        <tr>
					          <td nowrap align="right" width="13%">作者:</td>
					          <td width="41%"><input name="be.bookWriter" value="<s:property value="#session.be.bookWriter"/>"  class="text" style="width:250px" type="text" size="40" />

					       </tr>
					    
					      <tr>
					       <td nowrap align="right" width="13%">上传一张图书图片：</td>
					       <td><input type="text" name="be.bookPic"  value="<s:property value="#session.be.bookPic"/>" id="file" onclick="BrowseServer('file');" ></input></td>
					     
					       </tr>


					        <tr>
					         <td nowrap align="right" height="120px">图书简介：</td>
					          <td >
				<textarea cols="80" id="editor1" name="be.bookContent" rows="20"><s:property value="#session.be.bookContent"/></textarea>
			              </td>
					       </tr>
					    
                         
					  </table>
                        
                        
		
				</fieldset>			</TD>
		</TR>
		
		</TABLE>
	
	
	 </td>
  </tr>
  

		
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="submit" name="Submit" value="发布" class="button" onclick="link();"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/></TD>
			</s:form>
		</TR>
		
 
  </table>

</div>



</body>
</html>
