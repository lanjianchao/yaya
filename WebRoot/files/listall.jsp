<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*" %>
<%@ page language="java" import="java.text.SimpleDateFormat "%>

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
<s:form name="fom" id="fom" method="post" action="listall.jsp">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  
 
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
          	 <tr>
               <td height="20"><span class="newfont07">选择：<a href="#" class="right-font08" onclick="selectAll();">全选</a>-<a href="#" class="right-font08" onclick="unselectAll();">反选</a></span>
	              <input name="Submit" type="button" class="right-button08" value="删除所选任务" />
	              
          	 </tr><Not-Set>
              <tr>
                <td height="40" class="font42">
				<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">
				 <tr class="CTitle" >
                    	<td height="22" colspan="7" align="center" style="font-size:16px">作文列表</td>
                  </tr>
                  
                  
				  
				 
				  
				   <tr bgcolor="#FFFFFF">
				     <td width="4%" align="center" height="30">选择</td>
                    <th >作文标题</th>
                    <th >作者</th>
                    <th >年级</th>
                    <th >类型</th>
					<th >发布时间</th>
					<th >操作</th>
					</tr>
				
					<%! int pageSize=10;
					int num=pageSize;//实际每页的数目
int pageCount;
int showPage;
int recordCount;   //一共记录数
%>
<%
Connection con;
Statement sql;
ResultSet rs;

try{Class.forName("com.mysql.jdbc.Driver"); 
}catch(ClassNotFoundException e){
}

try{con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yaya" ,"root","123456");
sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
//返回可滚动的结果集 
rs=sql.executeQuery("select * from Message where mesIsPass='普通' order by mesId desc");
//将游标移到最后一行 
rs.last();
//获取最后一行的行号 
recordCount=rs.getRow();
//计算分页后的总数 
if(recordCount==0)   {pageCount=1; showPage=1;} 
else{
 pageCount=(recordCount%pageSize==0)?(recordCount/pageSize):(recordCount/pageSize+1);

//获取用户想要显示的页数：
String integer=request.getParameter("showPage");
if(integer==null){
integer="1";
}
try{showPage=Integer.parseInt(integer);
}catch(NumberFormatException e){
showPage=1;
}
if(showPage<=1){
showPage=1;
}
if(showPage>=pageCount){
showPage=pageCount;
}

//如果要显示第showPage页，那么游标应该移动到的posion的值是：
int posion=(showPage-1)*pageSize+1;
//设置游标的位置
rs.absolute(posion);

 
 if(showPage*pageSize>recordCount)   num=pageSize-(showPage*pageSize-recordCount); System.out.println(num+"--------------"+showPage);
for(int i=1;i<=num;i++){ 
%>
				
	
					<tr bgcolor="#FFFFFF">
					
					 <td height="20"><input type="checkbox" name="delid"/></td>
					<td> 
			<%=rs.getString(3) %>
					</td>
					<td> 
			<%=rs.getString(7) %>
					</td>
					<td> 
			<%=rs.getString(2) %>
					</td>
					<td> 
			<%=rs.getString(6) %>
					</td>
					<td>
					<% 
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
                    java.util.Date date=rs.getDate(5);  
                %>  
					<%=date %></td>
                    <td><a href="queryMes.action?mesId=<%=rs.getInt(1) %>" >编辑|</a><a href="listMes.action?mesId=<%=rs.getInt(1) %>">查看|</a>
					<a href="deleteMes.action?mesId=<%=rs.getInt(1) %>">删除</a></td>
				
                  </tr>
                  	
                  	<%rs.next(); 
                  	
                   } 
                   num=pageSize;
rs.close();
con.close();
}
}
catch(Exception e){e.printStackTrace(); }%>

             
                  	
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <td width="50%">共 <span class="right-text09"><%=pageCount %></span> 页 | 第 <span class="right-text09"><%=showPage %></span> 页</td>
                <td width="49%" align="right">[<a href="listall.jsp?showPage=1">首页</a> | <a href="listall.jsp?showPage=<%=showPage-1 %>" class="right-font08">上一页</a> | <a href="listall.jsp?showPage=<%=showPage+1 %>" class="right-font08">下一页</a> | <a href="listall.jsp?showPage=<%=pageCount %>" class="right-font08">末页</a>] 转至：</td>
                <td width="1%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="1%"><input name="showPage" type="text" class="right-textfield03" size="1" /></td>
                      <td width="87%"><input name="Submit23222" type="submit" class="right-button06" value=" " />
                      </td>
                    </tr>
                </table></td>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</s:form>
</body>
</html>