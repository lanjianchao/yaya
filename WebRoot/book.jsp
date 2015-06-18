<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*" %>

<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>丫雅作文培训机构</title>
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
		  	 <a href="indexQuery.action"><img src="./images/logo.jpg"> </a>
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
                        <a href="star.jsp">
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
                    <a href="indexQuery.action">
                        Home
                        <br/>
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
                    <h3>好书推荐</h3>

                </div>
              
                
                 
                

         

  
               <div id="fenye" class="plist" style="margin-top:6px;text-align:right;">
                    共２页 | 第１页
               <a href="book.jsp">[首页</a> | <a href="book.jsp" >上一页</a> | <a href="book2.jsp" >下一页</a> | <a href="book2.jsp" >末页</a>] 
             
                    </div>
            </div>

            <div class="pright">
                <div class="lan">
                    <ul>
                        <li>
                            <a href="all_passage.html">
                                全部作品
                            </a>
                        </li>

                        <li >
                            <a href="good_passage.html">
                                优秀作品
                            </a>
                        </li>
                        <li >
                            <a href="prize_passage.html">
                                获奖作品
                            </a>
                        </li>
                        <li >
                            <a href="public_passage.html">
                                已发表作品
                            </a>
                        </li>
                        <li >
                            <a href="composition.html">
                                在线投稿
                            </a>
                        </li>

                        <li  class="curr">
                            <a href="book.html">
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