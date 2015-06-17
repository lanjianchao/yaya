<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*" %>
<%@ page language="java" import="java.text.SimpleDateFormat "%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>丫雅作文培训机构_所有作品</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href='http://fonts.googleapis.com/css?family=Pompiere' rel='stylesheet' type='text/css'>
    <link href="./css/qiantaicss.css" rel="stylesheet" type="text/css" media="all" />
    <!--slider-->
    <link href="./css/flexslider.css" rel="stylesheet" type="text/css" media="all" />
    <script src="./js/jquery-1.7.1.min.js" type="text/javascript"></script>
    <script src="./js/jquery.flexslider.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
            SyntaxHighlighter.all();
        });
        $(window).load(function(){
            $('.flexslider').flexslider({
                animation: "slide",
                animationLoop: false,
                itemWidth: 210,
                itemMargin: 5,
                minItems: 2,
                maxItems: 4,
                start: function(slider){
                    $('body').removeClass('loading');
                }
            });
        });
    </script>
</head>
<body>
<div class="h-bg">
    <div class="wrap">
        <div class="header">
            <div class="logo">
               <a href="index.jsp"><img src="./images/logo.jpg"> </a>
            </div>

            <div class="nav">
                <ul>
                    <li class="c6">
                        <a href="baoming.html">
                            Contact
                            <br/>
                            <strong>我要报名</strong>
                        </a>
                    </li>
                    <li class="c5">
                        <a href="star.html">
                            Star
                            <br/>
                            <strong>丫雅之星</strong>
                        </a>
                    </li>
                    <li class="c2">
                        <a href="all_passage.jsp">
                            Essay
                            <br/>
                            <strong>作文专区</strong>
                        </a>
                    </li>

                    <li class="c3">
                        <a href="news.jsp">
                            Training
                            <br/>
                            <strong>丫雅培训</strong>
                        </a>
                    </li>

                    <li class="c4">
                        <a href="staff.jsp">
                            Teacher
                            <br/>
                            <strong>教师风采</strong>
                        </a>
                    </li>

                    <li class="c0">
                        <a href="about.html">
                            About
                            <br/>
                            <strong>学校介绍</strong>
                        </a>
                    </li>
                    <li class="c7">
                        <a href="index.jsp">
                            Home       <br/>
                            <strong>首页</strong>
                        </a>
                    </li>

                </ul>
            </div>

            <div class="clear"></div>
        </div>
    </div>
</div>

<div class="content_bg">
    <div class="wrap">
        <div class="main">
            <div class="pleft">
                <div class="daohang">
                    <h3>全部作品</h3>

                </div>

                    <div class="txtlist h500">
                        <ul>
                        
                             <%! int pageSize=11;
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
rs=sql.executeQuery("select * from Message where mesIsPass<>'未审核' order by mesId desc");
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

 
 if(showPage*pageSize>recordCount)   num=pageSize-(showPage*pageSize-recordCount);
for(int i=1;i<=num;i++){ 
%>
                            <li>
                                <a href="#"><%=rs.getString(3)%> </a>
                                <span style="color:red;"><% 
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
                    java.util.Date date=rs.getDate(5);  
                %>  
					<%=date %></span>
                            </li>
                              	<%rs.next(); 
                  	
                   } 
                   num=pageSize;
rs.close();
con.close();
}
}
catch(Exception e){e.printStackTrace(); }%>
                           
                        </ul>
                    </div>
                     <div id="fenye" class="plist" style="margin-top:6px;text-align:right;">
                    共 <%=pageCount %>页 | 第<%=showPage %>页
               <a href="all_passage.jsp?showPage=1">[首页</a> | <a href="all_passage.jsp?showPage=<%=showPage-1 %>" >上一页</a> | <a href="all_passage.jsp?showPage=<%=showPage+1 %>" >下一页</a> | <a href="all_passage.jsp?showPage=<%=pageCount %>" >末页</a>] 转至
               <form action="all_passage.jsp">
                <input name="showPage" type="text" size="4">&nbsp;<button id="go" name="go" type="submit">go</button>
                </form>
                    </div>


            </div>

            <div class="pright">
                <div class="lan">
                    <ul>
                        <li class="curr">
                            <a href="all_passage.jsp">
                                全部作品
                            </a>
                        </li>

                        <li >
                            <a href="good_passage.jsp">
                                优秀作品
                            </a>
                        </li>
                        <li >
                            <a href="prize_passage.jsp">
                                获奖作品
                            </a>
                        </li>
                        <li >
                            <a href="public_passage.jsp">
                                已发表作品
                            </a>
                        </li>
                        <li >
                            <a href="composition.html">
                                在线投稿
                            </a>
                        </li>

                        <li >
                            <a href="book.jsp">
                                好书推荐
                            </a>
                        </li>
                    </ul>
                </div>

                <div classs="izone">

                    <div>
                        <a href="comments.jsp">
                            <img style="width:225px;height:150px" src="./images/lyb.jpg">
                        </a>
                    </div>

                    <div>
                        <a href="rencai.jsp">
                            <img style="width:225px;height:150px" src="./images/rczp.jpg">
                        </a>
                    </div>


                </div>
            </div>
        </div>


</div>
    </div>


    <div class="footer">
        <div style="text-align: center">
    <span style="font-size:  14px">
        版权所有 @ 湖南丫雅教育xxxx

    </span><br/>
         <span style="font-size:  12px">
        2015-05-30

    </span>
        </div>
    </div>

</body>
</html>