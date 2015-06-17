<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>xxxx作文培训机构</title>
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
		  	 <a href="index.html"><img src="./images/logo.jpg"> </a>
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
<div class="content">
 <div class="imain">
     <div class="ileft">
 	<h2>教师风采</h2>
	<div class="clear"></div>
  <div class="teacher">

      <div class="each_teacher">
      <p>
          <img src="images/ls1.png">
          <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">飞飞老师</h3><br/>
          <p style="padding-right: 20px;">教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介 教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介</p>

          <div class="clear"></div>
      </p>
      </div>

      <div class="each_teacher">
          <p>
              <img src="images/ls1.png">
              <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">飞飞老师</h3><br/>
          教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介 教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介

          <div class="clear"></div>
          </p>
      </div>
      <div class="each_teacher">
          <p>
              <img src="images/ls1.png">
              <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">飞飞老师</h3><br/>
          教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介 教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介

          <div class="clear"></div>
          </p>
      </div>
      <div class="each_teacher">
          <p>
              <img src="images/ls1.png">
              <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">飞飞老师</h3><br/>
          教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介 教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介

          <div class="clear"></div>
          </p>
      </div>

      <div class="each_teacher">
          <p>
              <img src="images/ls1.png">
              <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">飞飞老师</h3><br/>
          教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介 教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介

          <div class="clear"></div>
          </p>
      </div>
      <div class="fenye" display="block;">
        

      </div>
  </div>
  
               <div id="fenye" class="plist" style="margin-top:6px;text-align:right;">
                    共２页 | 第１页
               <a href="staff.jsp">[首页</a> | <a href="staff.jsp" >上一页</a> | <a href="staff2.jsp" >下一页</a> | <a href="staff2.jsp" >末页</a>] 
             
                    </div>	
     </div>
     
     

     <div class="iright">

         <div classs="izone">
             <div>

                     <img style="height:520px" src="./images/xx.jpg">

             </div>
             <div>
                 <a href="comments.jsp">
                     <img style="height:150px" src="./images/lyb.jpg">
                 </a>
             </div>

             <div>
                 <a href="rencai.jsp">
                     <img style="height:150px" src="./images/rczp.jpg">
                 </a>
             </div>


         </div>

     </div>
  </div>

 </div>
</div>

<div class="wrap">

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
    </div>
</body>
</html>